package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElementHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");
		
		Thread.sleep(4000);

		
		
//		driver.findElement(By.id("searchInput")).sendKeys("notification");
		
		String search_script = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		//html element
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		//		//html element ---> Selenium WebElement
		WebElement search = (WebElement)js.executeScript(search_script);
		search.sendKeys("notification");
		
		
		
	}

}
