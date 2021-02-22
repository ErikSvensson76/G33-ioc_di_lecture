package org.example;

import org.example.config.AppConfig;
import org.example.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


        StudentService service = context.getBean(StudentService.class);

        System.out.println(service.create("Erik", "Svensson", LocalDate.now(), "erik@gmail.com").getName());

        context.close();

    }
}
