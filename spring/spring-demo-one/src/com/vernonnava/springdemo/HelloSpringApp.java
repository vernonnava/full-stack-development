package com.vernonnava.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		// print bean
		System.out.println(theCoach.getDailyWorkout());
		
		// print fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close config file
		context.close();
	}

}
