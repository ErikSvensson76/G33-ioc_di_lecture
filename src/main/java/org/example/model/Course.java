package org.example.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Course {

    private String courseId;
    private String courseName;
    private LocalDate start;
    private LocalDate end;
    private List<Student> students;

    public Course(String courseId, String courseName, LocalDate start, LocalDate end, List<Student> students) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.start = start;
        this.end = end;
        this.students = students;
    }

    public Course() {
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseId, course.courseId) && Objects.equals(courseName, course.courseName) && Objects.equals(start, course.start) && Objects.equals(end, course.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, courseName, start, end);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
