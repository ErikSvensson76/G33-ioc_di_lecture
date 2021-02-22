package org.example;

import org.example.config.ApplicationScanningConfig;
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
                new AnnotationConfigApplicationContext(ApplicationScanningConfig.class);


        StudentService service = context.getBean(StudentService.class);

        System.out.println(service.create("Erik", "Olsson", LocalDate.now(), "fdkfjds@gmail.com").getName());
    }
}
