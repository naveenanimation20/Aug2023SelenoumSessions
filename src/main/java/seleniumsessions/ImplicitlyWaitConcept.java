package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//Implicitly Wait:
		//dynamic wait
		//global wait: its applied for all the web elements (only for webelement)
		//applied after the driver intilization
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//selenium 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //selenium 4.x
		
		//login page: 10 secs
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");
		//e1 --> 10 secs --> 2 secs: 8 secs
		//e1 --> 10 secs --> 10 secs: nosuchelement exc
		
		//e2
		//e3
		//e4
		//e50
		
		//home page: 20 secs:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //selenium 4.x
		//e51, e52: 20 secs
		
		//login page:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //selenium 4.x
		//e1: 10 secs
		
		//register page: 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //selenium 4.x
		//RGe: 5 secs
		
		//page: 0 secs: nullification of imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); //selenium 4.x
		//e1 to e50: 0 secs
		
		//login page: 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //selenium 4.x

		//emailId: 10 secs: 2 secs: 8 secs will be ignored
		//password: 10 secs: 0 secs: 10 secs will be ignored 
		//login button: 10 secs: 0 secs: 10 secs will be ignored 
		
		//to optimize the wait: explicit wait: for the specific element
		//emailId: 10 secs: 2 secs: 8 secs will be ignored
		//password: no wait applied
		//login button: no wait applied
		
		//imp wait can not be used with non web elements (alerts, title, url)
		//exp wait can be used for non web elements
		
		//alert : 5 secs
		//driver.switchto.alert(); 
		

		
		
		
	}

}
