package com.javateam.amigoscode.service;

import com.javateam.amigoscode.model.Student;
import com.javateam.amigoscode.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void create(Student student){
        studentRepository.save(student);
    }
    public List<Student> getStudents(){
        List<Student> students;
        students = studentRepository.findAll();
        return students;
    }
}
