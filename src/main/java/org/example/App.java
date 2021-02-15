package org.example;

import org.example.data.CourseDAO;
import org.example.data.StudentDAO;
import org.example.model.Course;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CourseDAO courseDAO = context.getBean(CourseDAO.class);
        StudentDAO studentDAO = context.getBean(StudentDAO.class);

        String id = UUID.randomUUID().toString();

        courseDAO.persist(
                new Course(id, "Java", LocalDate.parse("2021-02-15"), LocalDate.now().plusMonths(4), null)
        );

        System.out.println(courseDAO.findById(id));

        context.close();
    }
}
