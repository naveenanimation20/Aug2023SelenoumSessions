package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSessionId {

	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();//123
//
//		driver.get("https://www.google.com");//123
//
//		String actTitle = driver.getTitle();//123
//		System.out.println("title is: " + actTitle);//Google

		//driver.quit();//quit the browser//123
		//sid = null
		
		//driver.close();//123//close the browser --> NoSuchSessionException: invalid session id
		
//		driver = new ChromeDriver();//sid=456
//		driver.get("https://www.google.com");//sid=456
//		System.out.println(driver.getTitle());//456-->valid SID...Google
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
	
		

	}

}
