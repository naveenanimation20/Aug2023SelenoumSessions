package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BAckgroundColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		WebElement element = driver.findElement(By.xpath("//input[@value='Login']"));
		
		
		
		String bgcolor = element.getCssValue("backgroundColor");
		System.out.println(bgcolor);
		
		Rectangle rect = element.getRect();//sel 4.x
		
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());

		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
		int x = element.getLocation().x;
		int y = element.getLocation().y;
		
				
		
	}

}
