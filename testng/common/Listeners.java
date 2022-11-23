package common;



import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.utilities;

public class Listeners extends utilities implements ITestListener {

	

	public void onTestStart(ITestResult result) {	
		Reporter.log("New Test Started" +result.getName());
		
		System.out.println("new test started");
	}
	
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test Successfully Finished" +result.getStatus());
		//System.out.println("test successfully finished");
	}

	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Test Failed" +result.getName());
		System.out.println("test failed ");
	
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("Test Skipped" +result.getName());
		System.out.println("test skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		Reporter.log("Test Failed but within success percentage" +result.getName());
		System.out.println("test failed but within success percentage");
		
	}

	public void onStart(ITestContext context) {
		
		
		Reporter.log("This is onStart method" +context.getOutputDirectory());
		System.out.println("this is onStart method");
	}

	public void onFinish(ITestContext context) {
			
		Reporter.log("This is onFinish method" +context.getPassedTests());
		System.out.println("on finish method");
		Reporter.log("This is onFinish method" +context.getFailedTests());
	}
}