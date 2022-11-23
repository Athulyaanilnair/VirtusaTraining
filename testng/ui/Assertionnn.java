package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionnn {
	/// method to verify title

	@Test
	public void titleTest() 
	{ 
		SoftAssert softassert = new SoftAssert(); // to exceute all the lines even if it has errors: but donot report the testcses failed 
		String expectedTitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		 String expectedtext = "Search1";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		// to get the actual title
		 String actualtitle = driver.getTitle();
		 
		 // to verify if both are equal 
		 System.out.println("verifying title");
		 softassert.assertEquals(expectedTitle, actualtitle);
		 
	// to verify if both the text are equals 
		 String actualtext = driver.findElementByXPath("//*[@id=\"gh-btn\"]").getAttribute("value");
		 System.out.println("verifying text");
		 softassert.assertEquals(actualtext, expectedtext, "nope");
		 
		 // to report the no.of test cases failed 
		 softassert.assertAll();
		 //Assertion.asserEquals();
		
	}

}
