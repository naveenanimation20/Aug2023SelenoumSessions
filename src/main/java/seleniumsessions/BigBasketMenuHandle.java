package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Actions class:
		// user actions: mouse and keyboard
		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		Thread.sleep(4000);
		

		By parentShopByMenu = By.xpath("(//span[text()='Shop by'])[2]");

		By beveragesSecondMenu = By.linkText("Fruits & Vegetables");

		By teaThirdMenu = By.linkText("Fresh Fruits");

		By greenTeafourthMenu = By.linkText("Mangoes");
		
		multliMenuHandle1(parentShopByMenu, beveragesSecondMenu, teaThirdMenu, greenTeafourthMenu);

	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void multliMenuHandle1(By parentMenuLocator, By firstChildMenuLocaor, By secondChildMenuLocaor,
			By thirdChildMenuLocaor) throws InterruptedException {

		Actions act = new Actions(driver);
		
		getElement(parentMenuLocator).click();
	
		act
				.pause(500)
					.moveToElement(getElement(firstChildMenuLocaor))
						.pause(500)
							.moveToElement(getElement(secondChildMenuLocaor))
								.pause(500)
									.click(getElement(thirdChildMenuLocaor)).build().perform();
		
		
	

	}
	
	
	

	public static void multliMenuHandle(By parentMenuLocator, By firstChildMenuLocaor, By secondChildMenuLocaor,
			By thirdChildMenuLocaor) throws InterruptedException {

		Actions act = new Actions(driver);
	
		driver.findElement(parentMenuLocator).click();

		Thread.sleep(1000);

		act.moveToElement(driver.findElement(firstChildMenuLocaor)).build().perform();

		Thread.sleep(1000);

		act.moveToElement(driver.findElement(secondChildMenuLocaor)).build().perform();

		Thread.sleep(1000);

		driver.findElement(thirdChildMenuLocaor).click();
		
		
		
	

	}

}
