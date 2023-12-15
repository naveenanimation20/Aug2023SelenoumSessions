package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser - chrome

		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#imageTemplateContainer img")).click();
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("automation");
		
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(header);
				
		
		//nested iframes
		
		
		
		//random pop up: 5 secs, 10 secs, 0 secs, no
		//prod
		//QA/STAGE/DEV: disabled popups
		
		
		
		
	}

}
