package org.example.service;

import org.example.dto.StudentDTO;
import org.example.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentDTOConverterImpl implements StudentDTOConverter{
    @Override
    public StudentDTO convert(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.setStudentId(student.getStudentId());
        dto.setName(student.getName());
        dto.setBirthDate(student.getBirthDate());
        return dto;
    }
}
