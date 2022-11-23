package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WEBdriverINTERFACE {

	/*---------to avoid this we use webdriver--------
	 *  public static FirefoxDriver driver;
		private static ChromeDriver driver2;
	 */

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "firefox";

		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("athulyaanu004@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		//// *[@id="identifierId"]

	}

}
