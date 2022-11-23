package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		// step 2: create object of the chrome driver
		ChromeDriver driver = new ChromeDriver();

		// step 3: open the browser
		driver.get("https://www.amazon.in/your-account");
		driver.findElementByXPath("//*[@id=\"nav-link-accountList-nav-line-1\"]").click();
		//driver.findElementByXPath("//*[@id=\"createAccountSubmit\"]").click();
		//driver.findElementByXPath("//*[@id=\"ap_customer_name\"]").sendKeys("Athulya");
		//driver.findElementByXPath("//*[@id=\"ap_phone_number\"]").sendKeys("9940874584");
		
		driver.findElementByXPath("//*[@id=\"ap_email\"]").sendKeys("athulyaanu004@gmail.com");
		driver.findElementByXPath("//*[@id=\"continue\"]").click();
		
		

	}
}
