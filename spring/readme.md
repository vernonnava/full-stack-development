This folder will include all the files I create for Spring. 

## Section 4: Spring Inversion of Control - XML Configuration ##

- Coach interface for various coaches
- Good software engineering practice - use interface
- Interface can be implemented amongst various types of coaches
- Spring provides object factory and will give you the appropriate properties

# Spring Container #

Primary functions
	a) Create and manage objects (Inversion of Control)
	b) Inject object's dependencies (Dependency Injection)
	
Configuring Spring Container
	a) XML config file (legacy, but legacy apps still use this)
	b) Java Annotations	
	c) Java Source Code
	
Spring Development Process
	a) Configure your Spring Beans
	- within a bean, you specify the ID and class (class name of implementation class)
	
	b) Create a Spring Container
	- generally known as ApplicationContext
	
	c) Retrieve Beans from Container
	- app talks to spring container
	
	# Coach is interface
	# myCoach = id of the bean
	# Coach.class = interface 
	- i.e. Coach theCoach = context.getBean("myCoach", Coach.class)
	
	# class = class that will implement the interface
	<bean id="myCoach" class="com.luv2code.springdemo.BaseballCoach"></bean>
	
Spring Bean - a java object
	- Java objects created by Spring container, then Spring refers to them as "Spring Beans"
	- created from normal Java classes like Java objects

Q: Why do we specify the Coach interface in getBean()?
	For example: Coach theCoach = context.getBean("myCoach", Coach.class);
	
A: When we pass the interface to the method, Spring will cast the object for you. Essentially, it will throw an exception. 

# ---------------------------------------------------- #
	
## Section 5: Spring Dependency Injection - XML Configuration ##

# Dependency Injection #

Dependency Inversion Principle - the client delegates calls to another object the responsibility of providing its dependencies

Primary Functions
	a) Create and manage objects (Inversion of Control)
	b) Inject object's dependencies (Dependency Injection)
	
Types of injection in Spring
	a) Constructor injection
	b) Setter injection
	
Development Process - Constructor Injection
	1) Define dependency interface and class
	
	public interface FortuneService { public string getFortune(); }
	
	public class HappyFortuneService implements FortuneService {
		// method implemented from interface is used by class
		public String getFortune() {
			return "Today is your lucky day!";
		}
	
	}

	2) Create constructor in class for injections
	
	public class BaseballCoach implements Coach {
	
		private FortuneService fortuneService;
		
		public BaseballCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService;
		}
	
	}
	
	3) Configure dependency injection in Spring config file
	
		a) create a bean for FortuneService
		b) inject dependency under constructor injection
		
		applicationContext.xml
		
		<bean id="myFortuneService" class="com.vernonnava.springdemo.HappyFortuneService"></bean>
		// equivalent to --> HappyFortuneService myFortuneService = new HappyFortuneService();
		
		
		<bean id="myCoach" class="com.vernonnava.springdemo.BaseballCoach"> <constructor-arg ref="myFortuneService" /></bean>
		// Baseball myCoach = new BaseballCoach(myFortuneService);