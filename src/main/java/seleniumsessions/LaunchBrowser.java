package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//windows:
		//System.setProperty("webdriver.chrome.driver", "c:\\naveen\\AugDrivers\\chromedriver.exe");

		//mac/linux:
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Documents/AugDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//browser 118 ---> 118.exe
		//4.3.0
		
		driver.get("https://www.google.com");
		
		//4.6.0+ --> 4.13.0
		//browser 118 --> download 118.exe from CFT dashboard in your .cache folder and will start the server automatically
		//119 --> 119.exe from CFT in .cache
				
	}

}
