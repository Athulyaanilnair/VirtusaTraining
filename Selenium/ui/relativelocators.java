package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
   

/*---------------------for Selenium 4 only------------------------------------------*/
public class relativelocators {
	public static void main(String args)
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement pw = driver.findElement(By.id("password"));
		//By passwordLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		
		/*
		 * near()
		 * below()
		 * above()
		 * leftof()
		 * rightof()
		 */
	}

}
