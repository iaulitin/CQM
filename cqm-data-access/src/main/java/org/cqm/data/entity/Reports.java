package org.cqm.data.entity;


import  javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Reports")
@NamedQuery(name = "Report.getAll", query = "select r from Reports r")
public class Reports {
    @Id
    private Integer reportId;
    @Column (name = "user_id")
    private Integer userId;
    @Column (name = "cafe_id")
    private Integer cafeId;
    @Column (name = "load")
    private Integer load;
    @Column (name = "date")
    private Calendar date;

    public Reports(Integer reportId, Integer userId, Integer cafeId, Integer load, Calendar date) {
        this.reportId = reportId;
        this.userId = userId;
        this.cafeId = cafeId;
        this.load = load;
        this.date = date;
    }

    public Reports(Integer reportId) {

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

    public Integer getCafeId() {
        return cafeId;
    }

    public void setCafeId(Integer cafeId) {
        this.cafeId = cafeId;
    }

    public Integer getLoad() {
        return load;
    }

    public void setLoad(Integer load) {
        this.load = load;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reports{" +
                "reportId=" + reportId +
                ", userId=" + userId +
                ", cafeId=" + cafeId +
                ", load=" + load +
                ", date=" + date +
                '}';
    }
}
