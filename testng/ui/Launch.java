package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
//	String browser1 = "chrome";
	public static WebDriver driver ;
@Parameters({"browser"})
	@Test
	public void LaunchApp(String browser1)
	{	
	
	System.out.println("intance of method");
	if(browser1.equals("chrome"))
	{
		System.out.println("if loop");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();	
	}
	else if(browser1.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	}
	
	driver.get("https://www.google.com");
}
 

	}


