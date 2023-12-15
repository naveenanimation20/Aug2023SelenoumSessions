package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		//Browser -- Page -- shadow DOM - Shadow DOM --- e1
		
		
		
		Thread.sleep(4000);
		
		//driver.findElement(By.id("pizza")).sendKeys("Veg Pizza");		
		
		String pizza_script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\");";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		//html element ---> Selenium WebElement
		WebElement pizza = (WebElement)js.executeScript(pizza_script);
		pizza.sendKeys("Veg Pizza");
		
		
		
	}

}
