package com.stark.springbootcassandra.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;

@Table(value = "Staff")
public class Staff {

    @PrimaryKey
    StaffPrimaryKey pk;

    String name;

    List<String> subjects;

    public StaffPrimaryKey getPk() {
        return pk;
    }

    public void setPk(StaffPrimaryKey pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
