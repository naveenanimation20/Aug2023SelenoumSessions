package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/");
	}
	
	
	//-ve
	//no prio -- alpha
	//+ve
	
	//no prio -- alpha
	//+ve
	
	//no prio -- alpha

	
	

	@Test(priority = -1)
	public void isOpenCartLogoIsVisibleTest() {
		boolean flag = driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(flag, true);
	}

	@Test(priority = 3)
	public void openCartTitleTest() {
		String actutalTitle = driver.getTitle();
		System.out.println(actutalTitle);
		Assert.assertEquals(actutalTitle, "Your Store11");
	}

	@Test(priority = 2)
	public void openCartURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("opencart11"));
	}

	@Test()
	public void atest() {
		System.out.println("atest");
	}

	@Test()
	public void best() {
		System.out.println("btest");

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
