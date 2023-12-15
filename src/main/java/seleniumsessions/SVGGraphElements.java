package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		
		Thread.sleep(5000);
		
		//Browser --page -- iframe -- svg
		
		String stateXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";
		//51
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		List<WebElement> statesList = driver.findElements(By.xpath(stateXpath));
		
		System.out.println(statesList.size());
		
		Actions act = new Actions(driver);
		for(WebElement e : statesList) {
			act.moveToElement(e).perform();
			Thread.sleep(500);
			String idVal = e.getAttribute("id");
			System.out.println(idVal);
				if(idVal.contains("florida")) {
					int size = e.getSize().getWidth();
					act.moveToElement(e, (size/2)-40, 0).click().perform();
					e.click();
					break;
				}
		}
		
	}

}
