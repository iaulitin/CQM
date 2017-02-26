package org.cqm.web.controller;

import org.cqm.data.entity.Report;
import org.cqm.data.services.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ReportController {

    @Resource(name = "reportService")
    private ReportService reportService;

    @RequestMapping(value = "/reports")
    public String listReports(Model model) {
        List<Report> reports = reportService.getReportRepository().findAllReportsOrderByDateDesc();
        model.addAttribute("reports", reports);
        return "report";
    }
}
