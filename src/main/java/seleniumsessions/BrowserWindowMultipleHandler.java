package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowMultipleHandler {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent
		
		String parentWindowId = driver.getWindowHandle();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		
		Set<String> handles = driver.getWindowHandles();//5 window ids
		
		//set to list:
//		List<String> handlesList = new ArrayList<String>(handles);
//		
//		for(String e : handlesList) {
//			
//		}
		
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1500);
			
				if(!windowId.equals(parentWindowId)) {
					driver.close();
				}
			
			
		}
		
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window URL:" + driver.getCurrentUrl());

	}

}
