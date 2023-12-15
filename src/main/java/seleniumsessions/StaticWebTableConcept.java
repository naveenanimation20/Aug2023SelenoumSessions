package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		//WebTable Traversing:
		
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		//table[@id="customers"]/tbody/tr[5]/td[1]
		//table[@id="customers"]/tbody/tr[6]/td[1]
		//table[@id="customers"]/tbody/tr[7]/td[1]
	
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int row = 2; row<=rowCount; row++) { //2 to 7
			String actXpath = beforeXpath + row + afterXpath; ////table[@id='customers']/tbody/tr[3]/td[1]
			//System.out.println(actXpath);
			String compName = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(compName);
		}
		
	
	
	}
	
	
	
	
	
	
}
