package com.stark.springbootcassandra.controller;

import com.stark.springbootcassandra.entity.Staff;
import com.stark.springbootcassandra.entity.StaffPrimaryKey;
import com.stark.springbootcassandra.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffRestController {

    @Autowired
    private StaffRepository staffRepository;

    @GetMapping
    public List<Staff> getAllStaff(){
        return staffRepository.findAll();
    }

    @PostMapping
    public Staff insertStaff(@RequestBody Staff staff){
        return staffRepository.insert(staff);
    }

    @PostMapping("/search")
    Staff findStaff(@RequestBody StaffPrimaryKey pk){
        return staffRepository.findById(pk).get();
    }

    @DeleteMapping
    void deleteStaff(@RequestBody StaffPrimaryKey pk){
        staffRepository.deleteById(pk);
    }
}
