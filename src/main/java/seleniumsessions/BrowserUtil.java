package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * 
 * @author naveenautomationlabs
 * BrowserUtil is having multiple generic methods to handle the various browser actions
 *
 */
public class BrowserUtil {

	private WebDriver driver;

	
	/**
	 * This method is used to launch the browser on the basis of given browserName
	 * @param browserName
	 * @return this returns the driver instance
	 */
	public WebDriver launchBrowser(String browserName) {
		System.out.println("browser name : " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("please pass the right browser.....");
			throw new AutomationException("INVALID BROWSER " + browserName);
		}
		
		return driver;

	}
	
	
	/**
	 * this method is used to launch the url.
	 * @param url
	 */
	public void launchURL(String url) {
		if(url == null) {
			System.out.println("URL IS NULL");
			throw new AutomationException("NULL URL");
		}
		
		//https://www.google.com
//		if(url.indexOf("http://")==0 || url.indexOf("https://")==0) {
//			driver.get(url);
//		}
//		else {
//			throw new AutomationException("HTTP is missing");
//		}
		
		if(url.indexOf("http")==0) {
			try {
			driver.get(url);
			}
			catch (Exception e) {
				System.out.println("http is missing");
				throw new AutomationException("HTTP is missing");

			}
		}
		else {
			throw new AutomationException("HTTP is missing");
		}
	}
	
	
	
	public void launchURL(URL url) {
		if(url == null) {
			System.out.println("URL IS NULL");
			throw new AutomationException("NULL URL");
		}
		
		driver.navigate().to(url);
	}
	
	
	
	
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		return title;
	}
	
	
	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Page url is : " + url);
		return url;
	}
	
	
	public boolean getPageSource(String value) {
		String pageSource = driver.getPageSource();
		if(pageSource.contains(value)) {
			return true;
		}
		return false;
	}
	
	
	public void closeBrowser() {
		driver.close();
		System.out.println("browser is closed");
	}
	
	
	public void quitBrowser() {
		driver.quit();
		System.out.println("browser is closed");
	}
	
	
	
	

}
