package org.cqm.data.repositories;

import org.cqm.data.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select u from User u where u.login = :login")
    List<User> findByLogin(@Param("login") String login);

    @Query("select u from User u where u.email = :email")
    List<User> findByEmail(@Param("email") String email);

    @Query("select u from User u order by u.rating desc")
    List<User> findUsersOrderByRatingDesc();

    @Query("select u from User u  where u.rating > :rating order by u.rating desc")
    List<User> findBetterUsers(@Param("rating") Integer rating);
}
