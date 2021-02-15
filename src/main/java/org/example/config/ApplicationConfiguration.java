package org.example.config;

import org.example.data.CourseDAOListImpl;
import org.example.data.StudentDAOListImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public CourseDAOListImpl courseDAOListImpl(){
        return new CourseDAOListImpl();
    }

    @Bean
    public StudentDAOListImpl studentDAOListImpl(){
        return new StudentDAOListImpl();
    }

}
