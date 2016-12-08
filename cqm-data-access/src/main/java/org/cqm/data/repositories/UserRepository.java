package org.cqm.data.repositories;

import org.cqm.data.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select u from User u order by u.userRating desc")
    List<User> findRatingTable();

    @Query("select u from User u where u.userId = :userId")
    List<User> findById(@Param("userId") Integer userId);

    @Query("select u from User u where u.lastName = :lastName")
    List<User> findByLastName(@Param("lastName") String lastName);

    @Query("select u from User u where u.userLogin = :userLogin")
    List<User> findByLogin(@Param("userLogin") String userLogin);

    @Query("select u from User u order by u.userId asc")
    List<User> findAllByOrderByUserIdAsc();

}
