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
        System.out.println(service.create("Erik", "Svensson", LocalDate.parse("1976-09-11"), "erik.svensson@lexicon.se").getName());

        context.close();
    }
}
