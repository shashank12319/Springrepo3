package com.jpa.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	    public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("com/jpa/text/beans.xml");
	        Car car = (Car) context.getBean("car");
	        car.start();
	    }
	}


