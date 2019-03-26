package com.yuluo.yuluoneo4j.repositories;

import com.yuluo.yuluoneo4j.domain.Movie;
import com.yuluo.yuluoneo4j.domain.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@RepositoryRestResource
public interface UserRepository extends Neo4jRepository<User, Long> {

    User findByName(@Param("name") String name);

    Collection<User> findByAge(@Param("age") Integer age);

    @Query("MATCH (n:User) RETURN n ")
    Collection<User> findAllUser();

    @Query("create (n:User{age:{age},name:{name}}) RETURN n ")
    User addUser(@Param("name") String name, @Param("age")int age);
}