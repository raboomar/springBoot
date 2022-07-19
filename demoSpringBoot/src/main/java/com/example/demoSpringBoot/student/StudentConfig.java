package com.example.demoSpringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student rami = new Student( "Rami",  LocalDate.of(1994, Month.JANUARY, 5), "rami@gmail");
           Student bill = new Student( "Bill",  LocalDate.of(2000, Month.JANUARY, 5), "rami@gmail");
            repository.saveAll(
                    List.of(rami,bill)
        );
        };

    }
}
