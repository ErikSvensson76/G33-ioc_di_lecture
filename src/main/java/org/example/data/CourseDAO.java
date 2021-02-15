package org.example.data;

import org.example.model.Course;

import java.util.Optional;

public interface CourseDAO {
    Course persist(Course course);
    Optional<Course> findById(String courseId);
    Course update(Course course);
    void delete(String courseId);
    void clear();
}
