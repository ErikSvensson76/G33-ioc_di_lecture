package org.example.service;

import org.example.dto.StudentDTO;

import java.time.LocalDate;
import java.util.List;

public interface StudentCRUDService {

    StudentDTO create(String firstName, String lastName, LocalDate birthDate, String email);
    StudentDTO findById(String studentId);
    List<StudentDTO> findAll();
    StudentDTO update(String studentId, String name, LocalDate birthDate, String email);
    boolean delete(String studentId);

}
