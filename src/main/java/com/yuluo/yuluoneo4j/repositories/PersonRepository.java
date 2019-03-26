package com.yuluo.yuluoneo4j.repositories;

import com.yuluo.yuluoneo4j.domain.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * @author pdtyreus
 * @author Mark Angrish
 */
@Repository
public interface PersonRepository extends Neo4jRepository<Person, Long> {

    Person findByName(String name);

}