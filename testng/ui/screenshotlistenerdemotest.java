package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Base;

public class screenshotlistenerdemotest extends Base{
	@Test
	public void launchApp()
	{
		driver.get("https://ebay.com");
		Assert.assertTrue(false);
	}

}
