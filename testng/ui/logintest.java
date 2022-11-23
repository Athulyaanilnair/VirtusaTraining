package ui;

import org.testng.annotations.Test;

public class logintest {

	@Test(priority =1,description ="logintset")
	public void blogintest() 
	{
		//test case 1

		System.out.println("log in");
	}
@Test(priority =2)
	public void alogout() //test case2
	{
		System.out.print("logout");
	}
}
//testng runs testcases in alphabetical order