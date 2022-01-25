package com.stark.springbootcassandra.repository;

import com.stark.springbootcassandra.entity.Staff;
import com.stark.springbootcassandra.entity.StaffPrimaryKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends CassandraRepository<Staff, StaffPrimaryKey> {
}
