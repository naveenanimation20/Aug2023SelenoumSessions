package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		// Actions class:
		// user actions: mouse and keyboard
		driver = new ChromeDriver();

		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

		
//		Actions act = new Actions(driver);
//		
//		By parentMenu = By.cssSelector("a.menulink");
//		WebElement parentMenuEle = driver.findElement(parentMenu);
//		
//		act.moveToElement(parentMenuEle).build().perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("COURSES")).click();
		
		//act.a1.a2.a3.a4.build().perform();
		
		//act.a1.perform -- valid
		//act.a1.build.perfom -- valid
		//act.a1.build -- invalid
		//act.a1 -- invalid
		
		By parentMenuLocator = By.cssSelector("a.menulink");
		By childMenuLocator = By.linkText("COURSES");
		
		parentChildMenu(parentMenuLocator, childMenuLocator);
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void parentChildMenu(By parentMenuLocator, By childMenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).build().perform();
		Thread.sleep(1000);
		driver.findElement(childMenuLocator).click();
	}
	

}
