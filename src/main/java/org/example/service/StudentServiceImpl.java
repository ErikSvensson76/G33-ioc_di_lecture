package org.example.service;

import org.example.data.StudentDAO;
import org.example.dto.StudentDTO;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDAO studentDAO;
    @Autowired
    private StudentDTOConverter converter;

    @Override
    public StudentDTO create(String firstName, String lastName, LocalDate birthDate, String email) {
        Student student = new Student(
                UUID.randomUUID().toString(),
                firstName.trim() + " " + lastName.trim(),
                birthDate,
                email
        );

        studentDAO.persist(student);
        return converter.convert(student);
    }

    @Override
    public StudentDTO findById(String studentId) {
        Optional<Student> optional = studentDAO.findById(studentId);
        if(optional.isPresent()){
            return converter.convert(optional.get());
        }
        throw new RuntimeException("Can't find user with id " + studentId);
    }

    @Override
    public List<StudentDTO> findAll() {
        return new ArrayList<>();
    }

    @Override
    public StudentDTO update(String studentId, String name, LocalDate birthDate, String email) {
        Student student = studentDAO.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Can't find user with id "+ studentId));

        student.setName(name);
        student.setBirthDate(birthDate);
        student.setEmail(email);
        return converter.convert(studentDAO.update(student));
    }

    @Override
    public boolean delete(String studentId) {
        studentDAO.delete(studentId);
        return !studentDAO.findById(studentId).isPresent();
    }
}
