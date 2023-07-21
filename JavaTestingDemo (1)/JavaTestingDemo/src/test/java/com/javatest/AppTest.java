package com.javatest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
	
//	@BeforeAll
//	void setUp()
//	{
////		Initializing the objects required ...
//	}
	
//	@BeforeEach
//	static void besetUp()
//	{
////		Initializing the objects required ...		
//	}
	
	
	@Test
	void testAdd()
	{
		System.out.println("Testing Add Method ...");
		Assertions.assertEquals(4, Calculator.add(2, 2));
	}
	
	@Test
	void testSub()
	{
		System.out.println("Testing Sub Method ...");
		Assertions.assertEquals(0, Calculator.sub(2, 2));
	}
	
	@Test
	void testInformation()
	{
		System.out.println("Testing Communication Method ...");
		CommunicationTest ctObj = new CommunicationTest();
		Assertions.assertEquals("Test Info", ctObj.myInformation("Info"));
	}
	
	
	
	
//	@AfterEach
//	static void tearDown()
//	{
////		Destroying the objects not required ...		
//	}

	
	

}
