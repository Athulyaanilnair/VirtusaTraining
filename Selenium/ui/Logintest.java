package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {

	public static void main(String[] args) {
		// step 1: setup webdriver
		WebDriverManager.chromedriver().setup();

		// step 2: create object of the chrome driver
		ChromeDriver driver = new ChromeDriver();

		// step 3: open the browser
		driver.get("https://www.saucedemo.com/");
		
		//find the web element by inspect
		driver.findElement(By.id("user-name")).sendKeys("standar_user");
		//driver.findElementByXPath("//*[@id=\"user-name\"]").sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElementByXPath("//*[@id="password"]").sendKeys("secret_sauce");
		
	
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElementByXPath("//*[@id=\"login-button\"]").click();
	//	driver.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]").click()
		
		//driver.close();
		
		
	

	}

}
