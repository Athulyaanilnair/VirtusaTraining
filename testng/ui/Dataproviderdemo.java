package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo {


//method1
	@Test(dataProvider="dataSet")
	public void Test1(String Usename , String Password)
	{
	 System.out.println(Usename+"======"+Password);
	}
	@DataProvider
	public Object[][] dataSet()
	{
		Object[][] dataSet= new Object[3][2];
		
		dataSet[0][0] ="user1";
		dataSet[0][1] ="pass1";
		
		dataSet[1][0] ="user2";
		dataSet[1][1] ="pass2";
		
		dataSet[2][0] ="user3";
		dataSet[2][1] ="pass3";
		
		return dataSet;
	}
	
	
	
	//method2
		@Test(dataProvider="dataSet1")
		public void Test2(String Usename , String Password)
		{
		 System.out.println(Usename+"======"+Password);
		}
		@DataProvider
		public Object[][] dataSet1()
		{
			return new Object[][]
					{
				
				{"user1","pass1"},
				{"user2","pass2"},
				{"user3","pass3"}
					};
		}
		
		
		//method3
		@Test(dataProvider="create")
		public void Test3(String Usename , String Password)
		{
		 System.out.println(Usename+"======"+Password);
		}
		@DataProvider(name="create")
		public Object[][] dataSet3()
		{
			return new Object[][]
					{
				
				{"anu1","anu1"},
				{"us2","us2"},
				{"u3","a3"}
					};
		}
			
	
	
}
