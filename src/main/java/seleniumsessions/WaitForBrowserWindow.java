package seleniumsessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent

		By twitter = By.xpath("//a[contains(@href,'twitter')]");

		 waitForVisibilityOfElement(twitter, 10).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		if (checkNewWindowExist(5, 2)) {

			// 1. fetch the windows ID:
			Set<String> handles = driver.getWindowHandles();

			Iterator<String> it = handles.iterator();

			String parentWindowId = it.next();
			System.out.println("parent window id: " + parentWindowId);

			String childWindowId = it.next();
			System.out.println("child window id: " + childWindowId);

			// 2. switching work:
			driver.switchTo().window(childWindowId);
			System.out.println("child window URL:" + driver.getCurrentUrl());

			driver.close();// child window will be closed

			// back to parent window:
			driver.switchTo().window(parentWindowId);
			System.out.println("parent window URL:" + driver.getCurrentUrl());

		}

	}

	public static boolean checkNewWindowExist(int timeOut, int expectedNumberOfWindows) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
			if (wait.until(ExpectedConditions.numberOfWindowsToBe(expectedNumberOfWindows))) {
				return true;
			}
		} catch (TimeoutException e) {
			System.out.println("number of windows are not same....");
		}
		return false;
	}

	public static WebElement waitForVisibilityOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

}
