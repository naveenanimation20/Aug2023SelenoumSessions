package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent

		String parentWindowId = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);//selenium 4.x
		
		Thread.sleep(2000);

		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println(driver.getTitle());
		
	
	}

}
