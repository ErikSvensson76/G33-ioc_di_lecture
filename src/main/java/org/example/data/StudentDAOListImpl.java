package org.example.data;

import org.example.model.Student;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class StudentDAOListImpl implements StudentDAO{

    private Set<Student> students;

    public StudentDAOListImpl() {
        this.students = new HashSet<>();
    }

    @Override
    public Student persist(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Optional<Student> findById(String studentId) {
        return students.stream()
                .filter(student -> student.getStudentId().equals(studentId))
                .findFirst();
    }

    @Override
    public Student update(Student student) {
        return student;
    }

    @Override
    public void delete(String studentId) {
        Student student = findById(studentId)
                .orElseThrow(() -> new RuntimeException("Could not find student aborted"));
        students.remove(student);

    }

    @Override
    public void deleteAll() {
        students.clear();
    }
}
