package com.stark.springbootcassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories(basePackages = { "com.stark.springbootcassandra" })
public class SpringbootCassandraApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCassandraApplication.class, args);
    }

}
