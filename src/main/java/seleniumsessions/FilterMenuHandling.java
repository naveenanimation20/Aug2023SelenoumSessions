package seleniumsessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.t-mobile.com/tablets");
		Thread.sleep(5000);

//		selectFilter("Brands", "Apple", "Samsung", "TCL");
//		
//		//selectFilter("Brands", "TCL");
//
//		
//		
//		selectFilter("Deals", "New", "Special offer");
////		
////		
//		selectFilter("Operating System", "iPadOS", "Android");
//		
//		
//		
		selectFilter("Brands", "all");
		
		
		
		
		
		

//		WebElement deals = driver.findElement(By.xpath("//legend[normalize-space()='Deals']"));
//		WebElement os = driver.findElement(By.xpath("//legend[normalize-space()='Operating System']"));
//		WebElement brands = driver.findElement(By.xpath("//legend[normalize-space()='Brands']"));
//		
//		Actions act = new Actions(driver);
//		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//
//
//
//		jsUtil.clickElementByJS(deals);
//		Thread.sleep(1000);
//		List<WebElement> dealsItems = driver.findElements(with(By.xpath("//span[@class='filter-display-name']")).below(deals).above(brands));
//		dealsItems.stream().forEach(e -> e.click());
//		
//		
//		jsUtil.clickElementByJS(brands);
//		Thread.sleep(1000);		
//		List<WebElement> brandsItems = driver.findElements(with(By.xpath("//span[@class='filter-display-name']")).below(brands).above(os));
//		brandsItems.stream().forEach(e -> System.out.println(e.getText()));
//		brandsItems.stream().forEach(e -> act.click(e).pause(500).perform());
//
//		
//		jsUtil.clickElementByJS(os);
//		Thread.sleep(1000);
//		List<WebElement> osItems = driver.findElements(with(By.xpath("//span[@class='filter-display-name']")).below(os));
//		osItems.stream().forEach(e -> e.click());

	}

	public static void selectFilter(String menu, String... subMenu) throws InterruptedException {

		driver.findElement(By.xpath("//legend[normalize-space()='" + menu
				+ "']//ancestor::mat-expansion-panel-header[contains(@id,'mat-expansion-panel-header')]")).click();
		//Thread.sleep(3000);

		if (subMenu[0].equalsIgnoreCase("all")) {
			String allItems_xpath = "//legend[normalize-space()='" + menu + "']" + "/ancestor::mat-expansion-panel-header"
					+ "/following-sibling::div[@role='region']" + "//mat-checkbox//label";
			System.out.println(allItems_xpath);

			driver.findElements(By.xpath(allItems_xpath)).stream().forEach(e -> e.click());
		} else {
			String filter_xpath = "//legend[normalize-space()='" + menu + "']" + "/ancestor::mat-expansion-panel-header"
					+ "/following-sibling::div[@role='region']" + "//mat-checkbox//span[normalize-space()='value']";
			Stream<String> stream = Arrays.stream(subMenu);
			stream.map(e -> filter_xpath.replace("value", e)).forEach(e -> driver.findElement(By.xpath(e)).click());

		}

		// driver.findElement(By.xpath(filter_xpath)).click();

	}

}
