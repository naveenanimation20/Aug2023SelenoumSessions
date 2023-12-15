package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		//selenium 4.x:
		
		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_UP).perform();

		//CMD/CNTRL + ARROW KEY DOWN
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();

		//scrollToElement:
		act.scrollToElement(driver.findElement(By.linkText("Help")))
					.click(driver.findElement(By.linkText("Help"))).build().perform();
	
		//refresh page:
		//driver.navigate().refresh();
		
		//cntrol+F5
		act.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
		
	}
	
	
	

}
