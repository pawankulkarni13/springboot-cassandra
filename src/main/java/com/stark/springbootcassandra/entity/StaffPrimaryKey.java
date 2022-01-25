package com.stark.springbootcassandra.entity;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
public class StaffPrimaryKey {
    @PrimaryKeyColumn(name = "id", type = PrimaryKeyType.PARTITIONED)
    Integer id;

    @PrimaryKeyColumn(name = "dept", type = PrimaryKeyType.CLUSTERED)
    String dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
