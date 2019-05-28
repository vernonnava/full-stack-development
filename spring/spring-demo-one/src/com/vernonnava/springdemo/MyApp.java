package com.vernonnava.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// create object
		// Coach interface creates a new Baseball coach
		Coach coach = new BasketballCoach();
		
		// use object
		System.out.println(coach.getDailyWorkout());
	}

}
