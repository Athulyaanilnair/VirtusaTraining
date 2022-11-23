package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pro1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElementByXPath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a").click();
		
		
		
/*----------------------------------------------TO CREATE AN ACCOUNT ----------------------------------------------------------
 *	
		
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("athulyaanu004@gmail.com");
		driver.findElementByXPath("//*[@id=\"SubmitCreate\"]/span").click();
		WebElement radio1 = driver.findElement(By.id("uniform-id_gender2"));
		Thread.sleep(5000);
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		radio1.click();
		driver.findElementByXPath("//*[@id=\"customer_firstname\"]").sendKeys("anu");
		driver.findElementByXPath("//*[@id=\"customer_lastname\"]").sendKeys("Anu");
		driver.findElementByXPath("//*[@id=\"passwd\"]").sendKeys("anu123");
		driver.findElementByXPath("//*[@id=\"days\"]").sendKeys("1");
		driver.findElementByXPath("//*[@id=\"months\"]").sendKeys("July");
		driver.findElementByXPath("//*[@id=\"years\"]").sendKeys("2001");
		//Thread.sleep(5000);
		WebElement radio2 = driver.findElement(By.id("newsletter"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.id("optin"));
		radio3.click();
		driver.findElementByXPath("//*[@id=\"address1\"]").sendKeys("India");
		driver.findElementByXPath("//*[@id=\"city\"]").sendKeys("cbe");
		driver.findElementByXPath("//*[@id=\"id_state\"]").sendKeys("Florida");
		driver.findElementByXPath("//*[@id=\"postcode\"]").sendKeys("62917");
		driver.findElementByXPath("//*[@id=\"id_country\"]").sendKeys("United States");
		driver.findElementByXPath("//input[@id=\"phone_mobile\"]").sendKeys("9940887654");
		driver.findElementByXPath("//*[@id=\"alias\"]").sendKeys("nil");
		driver.findElementByXPath("//*[@id=\"submitAccount\"]/span").click();
		
----------------------------------------------------------------------------------------------------------------------------------*/
		driver.findElementByXPath("//*[@id=\"email\"]").sendKeys("athulyaanu2307@gmail.com");
		driver.findElementByXPath("//*[@id=\"passwd\"]").sendKeys("anu123");
		driver.findElementByXPath("//*[@id=\"SubmitLogin\"]/span").click();
		driver.findElementByXPath("//*[@id=\"search_query_top\"]").sendKeys("SLEEVE");
		driver.findElementByXPath("//*[@id=\"searchbox\"]/button").click();
		driver.findElementByXPath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span").click();
		
	}
}
