package ui;

import org.testng.annotations.Test;

import common.Listeners;
@Test
public class ReportTest extends Listeners {

	
	public void repoteraTest1()
	{
		System.out.println("TEST1");
	}

	public void reporterrbTest2()
	{
		//Reporter.log("Test 2 sucess"); // not generic i.e not for many number of test cases
		System.out.println("TEST2");
	}

	public void reportercTest3()
	{
		System.out.println("TEST3");
	}


}
