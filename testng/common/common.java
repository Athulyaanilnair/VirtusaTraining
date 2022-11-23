package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class common {

	@BeforeSuite
	public void M1()
	{
		System.out.println("1");
	}

	@AfterSuite
	public void M2()
	{
		System.out.println("8 the last");
	}
	
	
}
