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

public class annotations
{
	// basic ----> @Test
	// priority (num ,description)
	// description ="String" ---------> about the test cases 
	//@BeforeTest 
	//@AfterTest
	//@BeforeMethod
	//@AfterMethod
	//@AfterGroups
	//@BeforeGroups
	//@AfterClass
	//@BeforeClass
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before Suite");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("After class");
	}
	
	
	@BeforeTest                                                //--------------------------> works before all the cases
	public void logintoapp()
	{
		System.out.println("logs in first before all other cases");
	}
	
	@BeforeMethod
	public void login1()
	{
		System.out.println("test1");
	}
	
	@AfterMethod
	public void login2()
	{
		System.out.println("test2");
	}
	
	@BeforeGroups(value="a")
	public void beforegroups()
	{
		System.out.println("beforegroups");
	}
	@AfterGroups(value="b")
	public void aftergroups()
	{
		System.out.println("aftergroups");
	}
	
	
	
	@AfterTest       //-----------------------------> works after all the cases
	public void logouttoapp()
	{
		System.out.println("logs out after all other cases");
	}
	
	@Test(groups="a")
	public void LoginTest()
	{
		System.out.println("GROUP A");
	}
	
	@Test (groups="b")
	public void Logout()
	{
		System.out.println("GROUP B");
	}
	
	

	
}
