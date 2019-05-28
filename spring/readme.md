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
	

	

