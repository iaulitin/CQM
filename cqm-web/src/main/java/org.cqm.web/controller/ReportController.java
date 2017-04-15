package org.cqm.web.controller;

import org.cqm.data.entity.Cafeteria;
import org.cqm.data.entity.Report;
import org.cqm.data.entity.User;
import org.cqm.data.entity.Vote;
import org.cqm.data.services.ReportService;
import org.cqm.data.services.UserService;
import org.cqm.data.services.VoteService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ReportController {

    @Resource(name = "reportService")
    private ReportService reportService;

    @Resource(name = "userService")
    private UserService userService;

    @Resource(name = "voteService")
    private VoteService voteService;

    @RequestMapping(value = "/reports", method = RequestMethod.GET)
    public String listReports(Model model) {
        List<Report> reports = reportService.getReportRepository().findAllReportsOrderByDateDesc();
        if (reports.size() > 10) {
            reports.subList(0,10);
        }
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String currentName = auth.getName();
        for (int i = 0; i < reports.size(); ++i) {
            if (reports.get(i).getRating() <= -3) {
                reports.remove(i);
            }
            Report currentReport = reports.get(i);
            List<User> users = reportService.getReportRepository().findAuthorOfReport(currentReport.getReportId());
            if (users != null && !users.isEmpty()) {
                User author = users.get(0);
                currentReport.setAuthor(author.getLogin());
                currentReport.setAuthorRating(author.getRating());
                if (author.getLogin().equals(currentName)) {
                    currentReport.setIsAuthor(true);
                } else {
                    currentReport.setIsAuthor(false);
                }
            }
            List<Cafeteria> cafeterias = reportService.getReportRepository().findCafeOfReport(currentReport.getReportId());
            if (cafeterias != null && !cafeterias.isEmpty()) {
                Cafeteria cafeteria = cafeterias.get(0);
                currentReport.setCafeName(cafeteria.getCafeName());
            }
            if (!(voteService.getVoteRepository().findVoteByReportAndUser(SecurityContextHolder.getContext().getAuthentication().getName(), currentReport.getReportId())).isEmpty()) {
                currentReport.setIsVoted(true);
            } else {
                currentReport.setIsVoted(false);
            }
        }
        model.addAttribute("reports", reports);
        return "report";
    }

    @RequestMapping(value = "/reports/negative/{reportId}", method = RequestMethod.GET)
    public String rateReportsNeg(@PathVariable("reportId") Integer currentReportId, Model model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String currentName = auth.getName();
        User currentUser = userService.getUserRepository().findByLogin(currentName).get(0);
        Report currentReport = reportService.getReportRepository().findOne(currentReportId);
        try {
            Vote vote = new Vote();
            vote.setUserId(currentUser.getId());
            vote.setReportId(currentReport.getReportId());
            vote.setVote(-1);
            voteService.getVoteRepository().save(vote);
            voteService.getVoteRepository().decrementUserRating(currentReport.getUserId());
            voteService.getVoteRepository().decrementReportRating(currentReportId);
        } catch (Exception e) {

        } finally {
            return this.listReports(model);
        }
    }

    @RequestMapping(value = "/reports/positive/{reportId}", method = RequestMethod.GET)
    public String rateReportsPos(@PathVariable("reportId") Integer currentReportId, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String currentName = auth.getName();
        User currentUser = userService.getUserRepository().findByLogin(currentName).get(0);
        Report currentReport = reportService.getReportRepository().findOne(currentReportId);
        try {
            Vote vote = new Vote();
            vote.setUserId(currentUser.getId());
            vote.setReportId(currentReport.getReportId());
            vote.setVote(1);
            voteService.getVoteRepository().save(vote);
            voteService.getVoteRepository().incrementUserRating(currentReport.getUserId());
            voteService.getVoteRepository().incrementReportRating(currentReportId);
        } catch (Exception e) {

        } finally {
            return this.listReports(model);
        }
    }
}
