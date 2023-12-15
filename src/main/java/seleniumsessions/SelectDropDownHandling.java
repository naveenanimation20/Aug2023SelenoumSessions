package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		//drop down -- htmltag: <select> --> <option> 
		//Use Select class
		//single selection
		//multi selection
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By country = By.id("Form_getForm_Country");
//		WebElement country_ele = driver.findElement(country);
//		
//		Select select = new Select(country_ele);
//		select.selectByIndex(5); //month 1 to 12
//		Thread.sleep(1000);
//		select.selectByVisibleText("Brazil");
//		Thread.sleep(1000);
//		select.selectByValue("India");
		
		doSelectDropDownByIndex(country, 5);
		
		doSelectDropDownByVisibleText(country, "Brazil");
		
		doSelectDropDownByValue(country, "India");
		
		//20 drop downs
//		doSelectDropDownByVisibleText(country, "Brazil");
//		doSelectDropDownByVisibleText(city, "Brazil");
//		doSelectDropDownByVisibleText(emp, "Brazil");
//		doSelectDropDownByVisibleText(comp, "Brazil");


	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	

}
