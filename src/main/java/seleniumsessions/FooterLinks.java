package seleniumsessions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		By footerLinks = By.xpath("//footer//a");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		int count = eleUtil.getElementsCount(footerLinks);
		System.out.println(count);
		
		List<String> actFooterTextList = eleUtil.getElementsTextList(footerLinks);
		
		List<String> expectedFooters = Arrays.asList("About Us", "Returns", "Specials", "Wish List");
		
		if(actFooterTextList.containsAll(expectedFooters)) {
			System.out.println("imp footer links --- PASS");
		}
				
		
//		List<WebElement> footerLinksList = driver.findElements(footerLinks);
//		
//		System.out.println(footerLinksList.size());
//		
//		for(WebElement e : footerLinksList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		
		
	}

}
