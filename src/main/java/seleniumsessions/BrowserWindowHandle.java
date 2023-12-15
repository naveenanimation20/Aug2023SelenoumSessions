package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//child
		
		//1. fetch the windows ID:		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id: " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id: " + childWindowId);

		Thread.sleep(3000);

		//2. switching work:
		driver.switchTo().window(childWindowId);
		System.out.println("child window URL:" + driver.getCurrentUrl());
		
		driver.close();//child window will be closed
		
		Thread.sleep(3000);

		
		//back to parent window:
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window URL:" + driver.getCurrentUrl());

		driver.quit();//close parent window
		
		
		//browser tab
		//browser window
		//don't use switch.alert
		
		//switch.window
		//switch.frame
		//switch.alert
				
		
		
		
		
		
	}

}
