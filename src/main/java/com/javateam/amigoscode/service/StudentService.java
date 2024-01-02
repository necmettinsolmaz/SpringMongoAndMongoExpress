package com.javateam.amigoscode.service;

import com.javateam.amigoscode.dto.StudentRequest;
import com.javateam.amigoscode.dto.StudentResponse;
import com.javateam.amigoscode.model.Student;
import com.javateam.amigoscode.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void create(StudentRequest studentRequest){
        Student student = Student.builder()
                .name(studentRequest.getName())
                .number(studentRequest.getNumber())
                .build();
        studentRepository.save(student);
        log.info("{} idli {} adlı öğrenci kaydedildi.", student.getId(), student.getName());

    }
    public List<StudentResponse> getStudents(){
        List<Student> students = studentRepository.findAll();
        return students.stream()
                .map(this::mapToStudentResponse).toList();
    }
    private StudentResponse mapToStudentResponse(Student student){
        return StudentResponse.builder()
                .id(student.getId())
                .name(student.getName())
                .number(student.getNumber())
                .build();
    }
    public Optional<StudentResponse> getStudentById(String id){
        return studentRepository.findById(id)
                .map(student -> new StudentResponse(
                        student.getId(),
                        student.getName(),
                        student.getNumber()
                ));
    }
}
