package org.cqm.data.repositories;

import org.cqm.data.entity.Report;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Repository
public interface ReportRepository extends CrudRepository<Report, Integer> {


    @Query("select r from Report r  order by date desc")
    List<Report> findAllReportsOrderByDateDesc();
}
