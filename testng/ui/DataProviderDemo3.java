package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemo3 {

	@DataProvider(name="create")
	public Object[][] dataSet1(Method m)
	{
		Object[][] dataSet = null;
		
		if(m.getName().equals("Test1"))
		{
			dataSet=new Object[][]
					{
					
					{"standard_user","secret_sauce"},
					{"locked_out_user","secret_sauce"},
					{"problem_user","secret_sauce"},
					{"performance_glitch_user","secret_sauce"}
					
						};
		}
		else if(m.getName().equals("Test2"))
		{
			dataSet=new Object[][]
					{
				{"hai"},{"hello"}
					};
		}
		
		else if(m.getName().equals("Test3"))
		{
			dataSet=new Object[][]
					{
					
					{"standard_user","secret_sauce","A"},
					{"locked_out_user","secret_sauce","B"},
					{"problem_user","secret_sauce","C"},
					{"performance_glitch_user","secret_sauce","D"}
					
						};
		}
		return dataSet;
	}
}