package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student adi = new Student(
                    "Aditya",
                    "aditya1999@gmail.com",
                    LocalDate.of(1999, Month.JUNE,20)
            );

            Student raj = new Student(
                    "Raj",
                    "raj1998@gmail.com",
                    LocalDate.of(1998, Month.SEPTEMBER,22)
            );
            repository.saveAll(
                    List.of(adi,raj)
            );
        };
    }
}
