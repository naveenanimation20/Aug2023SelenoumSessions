package seleniumsessions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(5000);

		getCarouselItems();
	}
	
	
	public static void getCarouselItems() {
		
		//150
		String xpath = "//img[contains(@alt,'yellow-friday-selling-fast-uae')]/ancestor::div[@class='componentArea-19']/following-sibling::div//div[@data-qa='product-name']";
		String nextXpath = "//img[contains(@alt,'yellow-friday-selling-fast-uae')]/ancestor::div[@class='componentArea-19']/following-sibling::div[@class='componentArea-20']//div[contains(@class,'swiper-button-next')]";
		
		List<WebElement> productList = driver.findElements(By.xpath(xpath));//150
		System.out.println(productList.size());//150
		
		List<String> productNamesList = new ArrayList<String>();//150-->next-->150-->next--150
		Set<String> productSet = new HashSet<String>();//150--next--10=160
		
		while(!driver.findElement(By.xpath(nextXpath)).getAttribute("class").contains("swiper-button-disabled")) {
			
			for(WebElement e : productList) {
				String productName = e.getAttribute("title");
				productSet.add(productName);
			}
			
			driver.findElement(By.xpath(nextXpath)).click();
		}
				
		
		//print the products:
		for(String e : productSet) {
			System.out.println(e);
		}
		
		
	}
	
	
	
	

}
