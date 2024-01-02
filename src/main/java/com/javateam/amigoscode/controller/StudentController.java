package com.javateam.amigoscode.controller;

import com.javateam.amigoscode.dto.StudentRequest;
import com.javateam.amigoscode.dto.StudentResponse;
import com.javateam.amigoscode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
    public void createStudent(@RequestBody StudentRequest studentRequest){
        studentService.create(studentRequest);
    }
    @GetMapping("/student")
    public List<StudentResponse> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/student/{id}")
    public Optional<StudentResponse> getStudent(@PathVariable String id){
        return studentService.getStudentById(id);
    }
}
