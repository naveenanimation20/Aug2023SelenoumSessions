package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	
	//<tag type='file'> should be there
	//99.99%
	//if not there:
	//1. ask dev to add that type = file
	//2. 3rd party libs: AutoIT(windows - windows batch), Robot(windows), Sikuli(image based)
	
	driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Documents/PostmanFiles/user.json");
	
	//driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Documents/PostmanFiles/abc.json");

	
	
	}

}
