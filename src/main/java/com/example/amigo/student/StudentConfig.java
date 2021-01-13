package com.example.amigo.student;

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
            Student nischal = new Student(
                    1l,
                    "Nischal",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "boharanischal@gmail.com"
            );
            Student rajeev = new Student(
                    2l,
                    "Rajeev",
                    LocalDate.of(1998, Month.JANUARY, 5),
                    "boharanischal@gmail.com"
            );
            repository.saveAll(
                    List.of(nischal, rajeev)
            );
        };
    }
}
