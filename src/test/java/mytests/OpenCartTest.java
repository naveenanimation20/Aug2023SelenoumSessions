package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {

	@Test(priority = 1)
	public void isOpenCartLogoIsVisibleTest() {
		boolean flag = driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(flag, true);
	}

	@Test(priority = 3)
	public void openCartTitleTest() {
		String actutalTitle = driver.getTitle();
		System.out.println(actutalTitle);
		Assert.assertEquals(actutalTitle, "Your Store");
	}

	@Test(priority = 2)
	public void openCartURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("opencart"));
	}

}
