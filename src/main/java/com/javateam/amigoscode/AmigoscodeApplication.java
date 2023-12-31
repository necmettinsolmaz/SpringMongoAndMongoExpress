package com.javateam.amigoscode;

import com.javateam.amigoscode.model.Student;
import com.javateam.amigoscode.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AmigoscodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigoscodeApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(StudentRepository studentRepository){
        return args -> {
            Student student = Student.builder()
                    .id("a")
                    .name("Mahmut")
                    .number(66)
                    .build();
            studentRepository.insert(student);
        };
    }
}
