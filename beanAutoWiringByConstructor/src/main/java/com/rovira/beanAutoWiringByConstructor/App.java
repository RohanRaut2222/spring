package com.rovira.beanAutoWiringByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ReportManager;

public class App {
    public static void main(String[] args) {
    
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
    	ReportManager reportManager = applicationContext.getBean(ReportManager.class);
    	
    	reportManager.generateReport();
    }
}
