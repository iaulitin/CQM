package org.cqm.data.repositories;

import org.cqm.data.entity.Report;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dmitriy on 08.11.2016.
 */

@Repository
public interface ReportRepository extends CrudRepository<Report, Integer> {
    @Query("select r from Report r where r.load = :load")
    List<Integer> findByLoad(@Param("load") Integer load);

}
