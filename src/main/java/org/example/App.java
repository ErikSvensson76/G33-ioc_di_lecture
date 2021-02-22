package org.example;

import org.example.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

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

        StudentService service = context.getBean(StudentService.class);

        System.out.println(service.create("Erik", "Svensson", LocalDate.now(), "erik.svensson@lexicon").getName());

        context.close();
    }
}
