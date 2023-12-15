package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomwInsideIFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		
		//Browser -- Page -- iFrame --- shadow DOM(open) --- e1
		
		driver.switchTo().frame("pact");
		
		String tea_script = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		//html element ---> Selenium WebElement
		WebElement tea = (WebElement)js.executeScript(tea_script);
		tea.sendKeys("Masala Tea");
		
		
		//Playwright -- B -- Page --shadow dom -- e1
		
		//SVG: local-name() --> name()
		//shadow dowm: css: 
		
		
		
	}

}
