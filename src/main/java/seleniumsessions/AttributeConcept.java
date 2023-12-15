package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//webelement + perform action(getAttribute)
		
		
		By emailId = By.id("input-email");
		By registerLink = By.linkText("Register");
		
//		String palceholderVal = driver.findElement(emailId).getAttribute("placeholder");
//		System.out.println(palceholderVal);
//		
//		String hrefVal = driver.findElement(registerLink).getAttribute("href");
//		System.out.println(hrefVal);
//		
//		String className = driver.findElement(registerLink).getAttribute("class");
//		System.out.println(className);
		
//		driver.findElement(emailId).sendKeys("tom@gmail.com");
//		String text = driver.findElement(emailId).getAttribute("value");
//		System.out.println(text);
				
		String palceholderVal = doGetElementAttribute(emailId, "placeholder");
		System.out.println(palceholderVal);
		
		String hrefVal = doGetElementAttribute(registerLink, "href");
		System.out.println(hrefVal);
		
		String value = doGetElementAttribute(emailId, "value");
		System.out.println(value);
		
		By pwd = By.id("input-password");
		driver.findElement(pwd).sendKeys("naveen@123");
		String pv = doGetElementAttribute(pwd, "value");
		System.out.println(pv);		
	}
	
	
	public static String doGetElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
	
	
	

}
