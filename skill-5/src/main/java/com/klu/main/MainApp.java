package com.klu.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klu.config.AppConfig;
import com.klu.model.Student;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        try {
            Student student = context.getBean(Student.class);
            student.display();
        } finally {
            context.close();
        }
    }
}