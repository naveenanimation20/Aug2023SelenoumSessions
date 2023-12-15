package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");

//		Select select = new Select(driver.findElement(By.xpath("//select")));
//		
//		if(select.isMultiple()){
//			System.out.println("yes, its multiple drop down");
//			select.selectByVisibleText("American flamingo");
//			select.selectByVisibleText("Greater flamingo");
//			select.selectByVisibleText("Lesser flamingo");
//
//		}

//		int selectedCount = select.getAllSelectedOptions().size();
//		System.out.println(selectedCount);
//
//		
//		Thread.sleep(3000);
//		
//		select.deselectByVisibleText("Lesser flamingo");
//		
//		Thread.sleep(3000);
//		
//		select.selectByVisibleText("Lesser flamingo");
//		
//		Thread.sleep(3000);
//
//		select.deselectAll();

		By dropDownLocator = By.xpath("//select");
		By optionLocator = By.xpath("//select/option");

		// TC 1. multiple values
		// selectDropDownMultipleValues(dropDownLocator, optionLocator, "American flamingo", "Greater flamingo", "Lesser flamingo");

		// TC 2. Single Value
		// selectDropDownMultipleValues(dropDownLocator, optionLocator,  "American flamingo");

		// TC 3. All Values
		selectDropDownMultipleValues(dropDownLocator, optionLocator, "all");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean isDropDownMultiple(By locator) {
		Select select = new Select(getElement(locator));
		return select.isMultiple() ? true : false;
	}

	/**
	 * This method is used to select the values from the drop down. It can select;
	 * 1. single selection
	 * 2. Multiple selection
	 * 3. All Selection: please pass "all" as a value to select all the values
	 * @param locator
	 * @param values
	 */
	public static void selectDropDownMultipleValues(By locator, By optionLocator, String... values) {
		Select select = new Select(getElement(locator));

		if (isDropDownMultiple(locator)) {

			if (values[0].equalsIgnoreCase("all")) {
				List<WebElement> optionsList = driver.findElements(optionLocator);
				for (WebElement e : optionsList) {
					e.click();
				}
			} else {
				for (String value : values) {
					select.selectByVisibleText(value);
				}
			}

		}

	}

}
