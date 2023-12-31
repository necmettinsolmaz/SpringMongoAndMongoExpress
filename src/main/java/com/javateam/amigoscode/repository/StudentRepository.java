package com.javateam.amigoscode.repository;

import com.javateam.amigoscode.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String > {
}
