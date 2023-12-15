package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUpHandling {

	public static void main(String[] args) throws InterruptedException {

		//alert: JS pop up//modal dialog pop ups
		//1. alert
		//2. prompt
		//3. confirm
		
		//Handled by Alert API
		
		WebDriver driver = new ChromeDriver();//Browser
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");//Page
		
		//1. alertJS popup:
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		Thread.sleep(3000);
//		alert.accept();//accept the alert
		
		//alert.dismiss();//cancel the alert
		
		//NoAlertPresentException: no such alert
		
		//2. confirm pop up
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(3000);
//		alert.dismiss();
		
		
		//3. prompt pop up:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("automation");
		Thread.sleep(3000);
		alert.accept();
		
		
	}

}
