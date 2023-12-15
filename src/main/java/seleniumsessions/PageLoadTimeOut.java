package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		//Sets the amount of time to wait for a page load to complete before throwing an error.

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}

}
