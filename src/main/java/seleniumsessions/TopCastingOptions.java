package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//Local machine but only for the specific browser: valid
		//1. ChromeDriver driver = new ChromeDriver();
		
		//valid+recommended : Local machine + cross browser
		//2. WebDriver driver = new ChromeDriver();
		
		//3. valid + not recommended
		//SearchContext driver = new ChromeDriver();
		
		//4. valid + recommended
		//RemoteWebDriver driver = new ChromeDriver();
		
		//5. valid + recommended: to run tests on grid/remote machine/cloud
		//WebDriver driver = new RemoteWebDriver(ip address of the remote machine, capabilities);
		
		//6. valid + not recommended: 
		//ChromiumDriver driver = new ChromeDriver();
		
		
		//pw___> grid
		//cy ---> cy dashboard(price)
		
		String csvData = "John,Doe,30";
		String[] parts = csvData.split(",");
		System.out.println("First name: " + parts[0]);
		
	}

}
