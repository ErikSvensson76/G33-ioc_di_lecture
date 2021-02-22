package org.example.service;

import org.example.dto.StudentDTO;
import org.example.model.Student;

public interface StudentDTOConverter {
    StudentDTO convert(Student student);
}
