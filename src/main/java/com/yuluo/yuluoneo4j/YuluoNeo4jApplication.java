package com.yuluo.yuluoneo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;


@SpringBootApplication
@EnableNeo4jRepositories("com.yuluo.yuluoneo4j.repositories")
public class YuluoNeo4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuluoNeo4jApplication.class, args);
    }
//aaa
}
