package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {


		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			String browser = "chrome";

			if (browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			Thread.sleep(5000);
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_uesr");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			driver.close();


	}

}
