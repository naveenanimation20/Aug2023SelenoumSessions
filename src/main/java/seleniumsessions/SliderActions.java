package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
		WebElement slider = driver.findElement(By.id("slider"));
		
		
		int width = slider.getSize().getWidth();
		System.out.println(width);
		
		Actions act = new Actions(driver);
		act.clickAndHold(slider).moveByOffset((width/2)-4000, 0).build().perform();
		
		
//		xOffset horizontal offset. A negative value means moving the mouse left.
//		yOffset vertical offset. A negative value means moving the mouse up.
		
	}

}
