package com.rovira;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        WelcomeBean wb = (WelcomeBean)context.getBean(WelcomeBean.class);
        
        System.out.println(wb.getMessage());
    } 
}
