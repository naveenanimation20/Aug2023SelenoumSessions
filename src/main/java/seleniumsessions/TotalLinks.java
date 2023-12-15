package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		
				

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//get the total links on the page
		//get the text of each link but ignore the blank text links
		//get the href value for each link
		
		//links---> tag name: <a>
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("total links:" + linksList.size());
		
//		for(int i=0; i<linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//				if(text.length()!=0) {
//					System.out.println(i+ ":"+ text);
//				}
//		}
		
		
		for(WebElement e : linksList) {
			String text = e.getText();
			if(text.length()!=0) {
				String hrefVal = e.getAttribute("href");
				System.out.println(text + "====" + hrefVal);
			}
		}
		//web scrapping
		
		
		
		
	}

}
