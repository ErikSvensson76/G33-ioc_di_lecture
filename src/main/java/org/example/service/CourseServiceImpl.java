package org.example.service;

import org.example.dto.CourseDTO;
import org.example.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Override
    public CourseDTO create(String courseName, LocalDate start, LocalDate end) {
        return null;
    }

    @Override
    public CourseDTO findById(String courseId) {
        return null;
    }

    @Override
    public List<CourseDTO> findAll() {
        return null;
    }

    @Override
    public CourseDTO update(String courseId, String courseName, LocalDate start, LocalDate end, List<StudentDTO> students) {
        return null;
    }

    @Override
    public boolean delete(String courseId) {
        return false;
    }
}
