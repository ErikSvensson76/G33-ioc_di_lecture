package org.example.data;

import org.example.model.Course;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class CourseDAOListImpl implements CourseDAO{

    private Set<Course> courses;

    public CourseDAOListImpl() {
        this.courses = new HashSet<>();
    }

    @Override
    public Course persist(Course course) {
        courses.add(course);
        return course;
    }

    @Override
    public Optional<Course> findById(String courseId) {
        return courses.stream()
                .filter(course -> course.getCourseId().equals(courseId))
                .findFirst();
    }

    @Override
    public Course update(Course course) {
        return course;
    }

    @Override
    public void delete(String courseId) {
        Course course = findById(courseId).orElseThrow(() -> new RuntimeException("Could not find course aborted"));
        courses.remove(course);
    }

    @Override
    public void clear() {
        courses.clear();
    }
}
