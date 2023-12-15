package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;

		//sel+java/py/ruby 
		//JavascriptExecutor -- Interface
		//RemoteWebDriver imp JavascriptExecutor
		//JavascriptExecutor --> executeScript(script)
		//script --> executeScript(script) --> it will be executed on the browser - Page
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJs();
//		System.out.println(title);
//		
//		jsUtil.generateJSAlert("Hello Naveen");
		
//		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
//		System.out.println(pageText);
//		if(pageText.contains("Alerts & Reminders")) {
//			System.out.println("Alerts & Reminders --- PASS");
//		}
		
//		Thread.sleep(1000);
//		jsUtil.scrollPageDown();
//		Thread.sleep(1000);
//		jsUtil.scrollPageUp();
		
//		WebElement callsEle = driver.findElement(By.xpath("//h3[normalize-space()='Calls & Voice']"));
//		//jsUtil.scrollIntoView(callsEle);
//		jsUtil.drawBorder(callsEle);
		
//		WebElement loginForm = driver.findElement(By.id("hs-login"));
//		//jsUtil.drawBorder(loginForm);
//		jsUtil.flash(loginForm);
		
//		WebElement userName = driver.findElement(By.id("username"));
//		WebElement pwd = driver.findElement(By.id("password"));
//		jsUtil.flash(userName);
//		userName.sendKeys("test@gmail.com");
//		jsUtil.flash(pwd);
//		pwd.sendKeys("test@123");


//		WebElement rem = driver.findElement(By.id("remember"));
//		jsUtil.clickElementByJS(rem);
		
		//WebElement userName = driver.findElement(By.id("input-email"));
		jsUtil.sendKeysUsingWithId("input-email", "tom@gmail.com");

		
		
	}

}
