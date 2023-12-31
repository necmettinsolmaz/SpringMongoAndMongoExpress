package com.javateam.amigoscode.controller;

import com.javateam.amigoscode.model.Student;
import com.javateam.amigoscode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
    public void createStudent(Student student){
        studentService.create(student);
    }
    @GetMapping("student")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
