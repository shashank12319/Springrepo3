package com.jpa.text;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main{
public static void main(String[] args) {
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/jpa/text/beans.xml");
    Car car1 = context.getBean(Car.class);
    car1.drive();
    Car car2 = context.getBean(Car.class);
    car2.drive();
}
}

