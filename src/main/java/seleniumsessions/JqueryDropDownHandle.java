package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("span#speed-button")).click();
		Thread.sleep(2000);

		
		List<WebElement> optionsList = driver.findElements(By.cssSelector("ul#speed-menu div"));
		
		System.out.println(optionsList.size());
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
				if(text.equals("Fast")) {
					e.click();
					break;
				}
				
		}
		
		
	}

}
