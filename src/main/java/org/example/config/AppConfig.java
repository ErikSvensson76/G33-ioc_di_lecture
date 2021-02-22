package org.example.config;

import org.example.data.CourseDAO;
import org.example.data.CourseDAOListImpl;
import org.example.data.StudentDAOListImpl;
import org.example.service.StudentDTOConverterImpl;
import org.example.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CourseDAOListImpl courseDAOListImpl(){
        return new CourseDAOListImpl();
    }

    @Bean
    public StudentDAOListImpl studentDAOListImpl(){
        return new StudentDAOListImpl();
    }

    @Bean
    public StudentDTOConverterImpl studentDTOConverterImpl(){
        return new StudentDTOConverterImpl();
    }

    @Bean
    public StudentServiceImpl studentServiceImpl(){
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.setStudentDAO(studentDAOListImpl());
        studentService.setConverter(studentDTOConverterImpl());
        return studentService;
    }

}
