package com.stark.springbootcassandra.repository;

import com.stark.springbootcassandra.entity.Student;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CassandraRepository<Student, Integer> {
}
