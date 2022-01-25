package com.stark.springbootcassandra.controller;

import com.stark.springbootcassandra.entity.Student;
import com.stark.springbootcassandra.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @PostMapping
    public Student insertStudent(@RequestBody Student student){
        return studentRepository.insert(student);
    }

    @GetMapping("/{id}")
    Student findStudent(@RequestParam Integer id){
        return studentRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    void deleteStudent(@RequestParam Integer id){
        studentRepository.deleteById(id);
    }
}
