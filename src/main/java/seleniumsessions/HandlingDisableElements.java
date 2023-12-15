package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDisableElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://classic.freecrm.com/register/");
//		
//		Thread.sleep(3000);
//		
//		WebElement submit = driver.findElement(By.id("submitButton"));
//		
//		//submit.click();//ElementNotInterceptedException
//		
//		Actions act = new Actions(driver);
//		act.click(submit).perform();//No exception
		
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		WebElement pwd = driver.findElement(By.id("pass"));//this is disabled
		//pwd.sendKeys("test@123");//ElementNotInteractableException: element not interactable
		
		Actions act = new Actions(driver);
		act.sendKeys(pwd, "test@123").perform();//No exception
		

		//null keys using sendKeys
		driver.findElement(By.id("fname")).sendKeys(null);//IllegalArgumentException: Keys to send should be a not null CharSequence
		
		
		
	}

}
