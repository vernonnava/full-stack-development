package com.vernonnava.springdemo;

public class BaseballCoach implements Coach {

	// define private dependency field
	private FortuneService fortuneService;
	
	// define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "hello world!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "wagw1 brejin";
	}

}
