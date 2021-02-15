package org.example;

import org.example.config.ApplicationConfiguration;
import org.example.data.CourseDAO;
import org.example.data.StudentDAO;
import org.example.model.Course;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        StudentDAO studentDAO = context.getBean(StudentDAO.class);
        CourseDAO courseDAO = context.getBean(CourseDAO.class);

        String id = UUID.randomUUID().toString();

        courseDAO.persist(new Course(id, "C#", LocalDate.now(), LocalDate.now().plusMonths(8), null));
        System.out.println(courseDAO.findById(id));

        context.close();
    }
}
