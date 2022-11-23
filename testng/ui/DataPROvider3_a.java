package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPROvider3_a {

//method1
	@Test(dataProvider = "create",dataProviderClass = DataProviderDemo3.class)
	public void Test1(String Usename, String Password) {
		System.out.println(Usename + "======" + Password);
	}

	@Test(dataProvider = "create",dataProviderClass = DataProviderDemo3.class)
	public void Test2(String Usename) {
		System.out.println(Usename);
	}

	@Test(dataProvider = "create", dataProviderClass = DataProviderDemo3.class)
	public void Test3(String Usename, String Password, String OKay) {
		System.out.println(Usename + "======" + Password + "=========" + OKay);
	}

}
