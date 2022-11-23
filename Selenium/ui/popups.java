package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String un = "admin";
		String pw = "admi1n";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://"+un+":"+pw+"@the-internet.herokuapp.com/basic_auth");
	}

}
