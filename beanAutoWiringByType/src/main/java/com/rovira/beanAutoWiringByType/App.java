package com.rovira.beanAutoWiringByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ReportCreator;
import beans.ReportManager;

public class App {
    public static void main(String[] args) {
        
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
    	ReportManager reportManager =applicationContext.getBean(ReportManager.class);
    	reportManager.generateReport();
    }
}

