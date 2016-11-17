package org.cqm.data.entity;


import  javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "Reports")
@NamedQuery(name = "Report.getAll", query = "select r from Reports r")
public class Reports {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
    @SequenceGenerator(name = "my_entity_seq_gen", sequenceName = "cqm_id_sequence")
    private Integer reportId;

    @Column (name = "user_id")
    private Integer userId;

    @Column (name = "cafe_id")
    private Integer cafeId;

    @Column (name = "load")
    private Integer load;

    @Column (name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    public Reports() {
    }

    public Reports(Integer reportId, Integer userId, Integer cafeId, Integer load, Date date) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reports reports = (Reports) o;

        if (reportId != null ? !reportId.equals(reports.reportId) : reports.reportId != null) return false;
        if (userId != null ? !userId.equals(reports.userId) : reports.userId != null) return false;
        if (cafeId != null ? !cafeId.equals(reports.cafeId) : reports.cafeId != null) return false;
        if (load != null ? !load.equals(reports.load) : reports.load != null) return false;
        return date != null ? date.equals(reports.date) : reports.date == null;

    }

    @Override
    public int hashCode() {
        int result = reportId != null ? reportId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (cafeId != null ? cafeId.hashCode() : 0);
        result = 31 * result + (load != null ? load.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
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
