package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Base;

public class Retrysample extends Base{
	@Test(retryAnalyzer=common.MyRetry.class)
	public void launchApp()
	{
		driver.get("https://ebay.com");
		Assert.assertTrue(false);
	}

}
