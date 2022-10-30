package com.example.Training.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student kartin = new Student(
                    "kartin",
                    LocalDate.of(1235, Calendar.NOVEMBER, 3),
                    "@rmwog.cekf"
            );

            Student alex = new Student(
                    "alex",
                    LocalDate.of(442, Calendar.NOVEMBER, 7),
                    "@oferwjgop.cekf"
            );

            repository.saveAll(
                    List.of(alex, kartin)
            );
        };
    }
}
