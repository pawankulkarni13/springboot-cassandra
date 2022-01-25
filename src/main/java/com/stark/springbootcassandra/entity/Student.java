package com.stark.springbootcassandra.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value="Student")
public class Student {
    @PrimaryKey
    Integer id;

    String name;

    String dept;

    @Column("year_of_joining")
    Integer yearOfJoining;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(Integer yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }
}
