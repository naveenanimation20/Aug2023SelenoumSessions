package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		//::before
		//::after
		
		
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content');";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String mand_text = js.executeScript(script).toString();
		System.out.println(mand_text);
		if(mand_text.contains("*")) {
			System.out.println("first name is mandatory");
		}
		
	}

}
