package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class methodsinwebdriverinterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*-----------------------METHODS USED IN WEBDRIVERINTERFACE ----------------------------*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.google.com/search?q=selenium+dev&rlz=1C1CHBF_enIN997IN997&oq=&aqs=chrome.1.35i39i362l8.1518383j0j15&sourceid=chrome&ie=UTF-8");;
		
		
		String S = driver.getTitle();
		String S1 = driver.getPageSource();
		 String s = driver.getCurrentUrl();
		 System.out.println(s);	
		 System.out.println(S);
		 System.out.println(S1);
		 
		 driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("hai");
		List<WebElement> we = driver.findElements(By.xpath(("//*[@id=\"user-name\"]")));
		System.out.println(we);
		 /*
		 * get()--------- browse the link
		 * manage()------- to manage the browser 
		 * manage().window()--------- max. min. fullscreen etc.
		 * getCurrentUrl() ----- returns string
		 * getPageSource() ----- returns String 
		 * getTitle()----- returns string
		 * navigate()
		 * close()----current window
		 * quit()-----all the windows that is quits the driver
		 * findElement();----- finds particular element
		 * findElements();finds all the ele
		 * switchTo(); --- switch btwn the frames and window
		 * getWindowHandle()--------------------- handle the window
		 * getWindowHandles();
		 *   * 
		 */
		
	}

}
