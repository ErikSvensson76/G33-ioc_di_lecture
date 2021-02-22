package org.example.service;

import org.example.dto.CourseDTO;
import org.example.dto.StudentDTO;

import java.time.LocalDate;
import java.util.List;

public interface CourseCRUDService {
    CourseDTO create(String courseName, LocalDate start, LocalDate end);
    CourseDTO findById(String courseId);
    List<CourseDTO> findAll();
    CourseDTO update(String courseId, String courseName, LocalDate start, LocalDate end, List<StudentDTO> students);
    boolean delete(String courseId);
}
