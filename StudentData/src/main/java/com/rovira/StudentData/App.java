package com.rovira.StudentData;

import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rovira.controller.StudentController;
import com.rovira.model.Students;
import com.rovira.repository.StudentRepository;
import com.rovira.service.StudentService;

public class App {

    public static void main(String[] args) {
    	
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
    	StudentController studentController = applicationContext.getBean(StudentController.class);
    	studentController.startApplication();
    	
    }
}