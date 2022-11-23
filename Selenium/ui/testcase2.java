package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase2 {
	//DOUBT//

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 Thread.sleep(5000);
		 driver.manage().window().maximize();
		 driver.get("https://flipkart.com");
		 @SuppressWarnings("unused")
		int a = driver.findElements(By.tagName("a")).size();
		 System.out.println("number of links" +a);
		 
		 

	}

}
