package org.example.data;

import org.example.model.Student;

import java.util.Optional;

public interface StudentDAO {
    Student persist(Student student);
    Optional<Student> findById(String studentId);
    Student update(Student student);
    void delete(String studentId);
    void deleteAll();
}
