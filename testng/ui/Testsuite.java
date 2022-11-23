package ui;

import org.testng.annotations.Test;

@Test(groups="user-registration")
public class Testsuite {

	@Test(priority=1,groups="regression")
	public void atest1() {
		// test case 1

		System.out.println("test1");
	}

	//@Test(priority=2,groups="group1")
	public void btest2() // test case2
	{
		System.out.print("test2");
	}
	@Test(groups={"regression","bvt"})
	public void btest3() // test case3
	{
		System.out.print("test3");
	}
	@Test(groups="bvt")
	public void btest4() // test case4
	{
		System.out.print("test4");
	}
}
//testng runs testcases in alphabetical order