package org.example;

import org.example.config.ApplicationConfiguration;
import org.example.data.StudentDAO;
import org.example.model.Student;
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

        String id = UUID.randomUUID().toString();

        StudentDAO studentDAO = context.getBean(StudentDAO.class);
        studentDAO.persist(new Student(
                id, "Erik", LocalDate.now(), "erik@gmail.com"
        ));

        System.out.println(studentDAO.findById(id));

        context.close();
    }
}
