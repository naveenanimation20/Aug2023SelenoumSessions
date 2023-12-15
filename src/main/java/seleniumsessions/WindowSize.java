package seleniumsessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowSize {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Dimension dim = new Dimension(800, 500);
		
		driver.manage().window().setSize(dim);
		
		
		//responsive testing
		//driver.manage().window().setSize(new Dimension(1080, 2080));
		
		driver.get("https://www.amazon.com");
		
		
	}

}
