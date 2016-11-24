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


    @Query("select r from Report r where r.load = :load")
    List<Integer> findByLoad(@Param("load") Integer load);

    @Query("select r from Report r where (current_date - date) < :time")
    List<Date> findFreshestReports(@Param("time") Date time);

//    @Modifying
//    @Query("UPDATE User u SET u.userRating = u.userRating + 1 WHERE u.userId = Report.userId and Report.userId = userId")
//    public void incrementRating(@Param("userId") Integer userId);
//
//    @Modifying
//    @Query("UPDATE User u SET u.userRating = u.userRating - 1 WHERE u.userId = Report.userId and Report.userId = userId")
//    public void decrementRating(@Param("userId") Integer userId);
//
//    @Modifying
//    @Query(value = "insert into Reports (reportId, userId, cafeId, load, current_date);", nativeQuery = true)
//    public void createReport(@Param("userId") Integer userId, @Param("cafeId") Integer cafeId, @Param ("load") int load);
}
