package com.javateam.amigoscode;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmigoscodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigoscodeApplication.class, args);
    }
//    @Bean
//    CommandLineRunner runner(StudentRepository studentRepository){
//        return args -> {
//            Student student = Student.builder()
//                    .id("b")
//                    .name("Necmettin")
//                    .number(77)
//                    .build();
//            studentRepository.insert(student);
//        };
//    }
}
