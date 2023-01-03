package com.example.spingapi.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig{
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return arg -> {
            Student Metrey = new Student(
                "Metrey",
                "hemchanmetrey321@gmail.com",
                LocalDate.of(2000,Month.APRIL,25)
             
            );

            Student Gumiho = new Student(
                "Gumiho",
                "Gumiho321@gmail.com",
                LocalDate.of(2002,Month.DECEMBER,31)
               
            );
            repository.saveAll(List.of(Metrey,Gumiho));
        };
    }
}// end of class