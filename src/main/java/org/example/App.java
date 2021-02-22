package org.example;

import org.example.config.AppConfig;
import org.example.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService service = context.getBean(StudentService.class);

        System.out.println(service.create("Erik", "Svensson", null, null).getName());

        context.close();
    }
}
