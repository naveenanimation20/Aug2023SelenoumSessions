package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {

	public static void main(String[] args) {

		//headless browser testing:
		//no active browser window
		//no active UI
		//testing is happening behind the scene
		//faster than UI mode
		//but might not interact with some complex applications
		
		//when to use:
		//CI CD - Cloud - AWS - Linux - Jenkins
		

		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
		
		//WebDriver driver = new FirefoxDriver(fo);
		
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
		
		
		
		
	}

}
