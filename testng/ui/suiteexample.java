package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.common;

public class suiteexample extends common
{
	@BeforeTest                                    
	public void logintoapp()
	{
		System.out.println("2");
	}
	

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("3");
	}

	@BeforeMethod
	public void login1()
	{
		System.out.println("4");
	}
	@Test
	public void test()                           //==================================>Method (or) test 1
	{
		System.out.println("5");
	}
	

	@AfterMethod
	public void login2()
	{
		System.out.println("6");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("7");
	}
	
	@AfterTest       
	public void logouttoapp()
	{
		System.out.println("8");
	}
	

	

	
}
