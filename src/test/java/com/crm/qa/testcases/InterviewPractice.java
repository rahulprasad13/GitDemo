package com.crm.qa.testcases;

import org.testng.annotations.Test;

public class InterviewPractice {
	
	@Test
	public void Test()
	{
		System.out.println("Test method");
	}

	
	@Test(priority=1)
	public void Test1()
	{
		System.out.println("Test1 method");
	}
	
	@Test(priority=2)
	public void Test2()
	{
		System.out.println("Test2 method");
	}
}
