package ui;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations2 {
	
	@BeforeMethod
	public void beforetest()
	{
		System.out.println("before method begins");
	}
	@Test
	public void A() {
		System.out.println("method A ");
	}

}
