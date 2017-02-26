package org.cqm.data.repositories;

import org.cqm.data.entity.Cafeteria;
import org.cqm.data.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CafeteriaRepository extends CrudRepository<Cafeteria, Integer> {

    @Query("select c from Cafeteria c where c.cafeName = :cafeName")
    List<String> findByCafeName(@Param("cafeName") String cafeName);

    @Query("select c from Cafeteria c order by c.cafeId")
    List<Cafeteria> findAllCafeteriasOrderByCafeIdAsc();
}
