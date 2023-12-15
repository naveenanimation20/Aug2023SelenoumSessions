package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://nta.ac.in/Home");
		
		Actions act = new Actions(driver);
		
		Action move = act.pause(500)
		.sendKeys(Keys.PAGE_UP)
		.pause(500)
		.sendKeys(Keys.PAGE_DOWN).build();
		
		
		act
		.scrollToElement
		(driver.findElement(By.xpath("//h5[text()='Engineering Exam']/following-sibling::div/p[contains(text(),'The above mentioned policy')]")))
		.click(driver.findElement(By.xpath("//h5[text()='Engineering Exam']/following-sibling::div/p[contains(text(),'The above mentioned policy')]")))		
		.perform();

		
		move.perform();
		move.perform();
		move.perform();
		
	}

}
