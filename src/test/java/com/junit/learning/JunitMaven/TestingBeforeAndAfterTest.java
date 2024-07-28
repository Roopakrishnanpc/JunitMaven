package com.junit.learning.JunitMaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
//now you have 100 test instances then TestingBeforeAndAfterTest will create 100 instances or object of class will be created
//to fix this we can use below annotation, .permethod should not be used because it created same as before
//.class should be used per class the object will be created only once
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestingBeforeAndAfterTest {
	//constructor
	TestingBeforeAndAfterTest()
	{ 
		System.out.println("TRY RUNNING WITHOUT LIFECYCLE.PER_CLASS THAT TIME BEFOE ALL WILL BE RUN and if 2 test instances are there then two times object will be created, with lifecycle static or non static both can be called in @beforeall and @afterall methods, without mentioning that static should be mentioned in the @beforeall and @afterall");
		System.out.println("Test object created before test methos with this you can know how this lifecycle works, to fix this use the @@TestInstance(@TestInstance.Lifecycle.PER_CLASS which created object only once per class, if u use per_methos every method this will create new object");
	}
	@BeforeAll
	//note this will be the first method to be called even before instance of this class TestingBeforeAndAfterTest is created then only constructor is created then the object is created
	// void beforeAll()//its not mandataory to mention static as we have given lifecycle per class, but u can do that as well with static
	static void beforeAll() //since im using lifecycle i dont need to use static because only one object will be created anyways 
	{
		System.out.println("connection related statements can be mentioned here becase only once those statements will be mentioned");
		System.out.println("before all tests executed only through static method(u dont need to create instance of class to execute it, using class itself u can invoke) is called");
	}
	@AfterAll
	//static void afterAll()  //its not mandataory to mention static as we have given lifecycle per class, but u can do that as well with static
	 void afterAll() //since im using lifecycle i dont need to use static because only one object will be created anyways
	{
		System.out.println("after all tests executed only through static(u dont need to create instance of class to execute it, using class itself u can invoke) method is called");
	}
	Shape s=new Shape();
	@BeforeEach //if there are 5 test cases first this will be executed every time a test case is called
	//totally 5 times this method will be called in our case two time this will be called as we have 2test cases
	//this method came in junit 5 in junit 4 -> just use before
	void creationofobj()
	{
		s=new Shape();
		System.out.println("Before Test object creation");
	}
	@AfterEach//same like beforeeach this will be executed after each test instances. in our case two times
	//in junit 4-> after in junit 5 aftereach is called
	void destry()
	{
	 System.out.println("Db closed, this can be used like finally where some excetion created then u must have finally to close the db.close or file.close or session.close");
	}
	@Test
	void testComputerSqaureArea() {
		
		//double actual=s.areaOfSquare(10);
		//double expected=100;
		assertEquals(100, s.areaOfSquare(10));
	}
	@Test
	void testComputeCirclearea() {
		//Shape s=new Shape();
//		double actual=s.cirleOfArea(5);
//		double expected=78.5;
		assertEquals(78.5, s.cirleOfArea(5));
	}

}
