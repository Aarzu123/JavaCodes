package com.javatest;

public class CommunicationTest {

	public String myInformation(String data)
	{
		StringBuilder result = new StringBuilder();
		
		if(data == null || data.trim().length() == 0)
		{
			result.append("Enter the required details !!!");			
		}
		else
		{
			result.append("Test "+ data);			
		}
		
		return result.toString();
	}
}