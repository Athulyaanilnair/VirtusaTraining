package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Base;
import io.github.bonigarcia.wdm.WebDriverManager;




public class utilities extends Base {
	public void getScreenshot () throws IOException {
		// TODO Auto-generated method stub
		Date currentdate=new Date();
		System.out.println(currentdate);
		String screenshotfilename=currentdate.toString().replace(" ","-").replace(":","-");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//Screenshot//" +screenshotfilename+ ".png"));
//		FileUtils.copyFile(src,dest)
		// new File(".//ScreenShot/screen.png");
		

	}

}


