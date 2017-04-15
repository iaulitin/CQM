package org.cqm.data.entity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "Votes")
@NamedQuery(name = "Votes.getAll", query = "select v from Vote v")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
    @SequenceGenerator(name = "my_entity_seq_gen", sequenceName = "cqm_id_sequence")
    @Column(name = "vote_id")
    private Integer voteId;

    @Column(name = "report_id")
    private Integer reportId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "vote")
    private Integer vote;

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vote vote1 = (Vote) o;

        if (!voteId.equals(vote1.voteId)) return false;
        if (!reportId.equals(vote1.reportId)) return false;
        if (!userId.equals(vote1.userId)) return false;
        return vote.equals(vote1.vote);

    }

    @Override
    public int hashCode() {
        int result = voteId.hashCode();
        result = 31 * result + reportId.hashCode();
        result = 31 * result + userId.hashCode();
        result = 31 * result + vote.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "voteId=" + voteId +
                ", reportId=" + reportId +
                ", userId=" + userId +
                ", vote=" + vote +
                '}';
    }
}
