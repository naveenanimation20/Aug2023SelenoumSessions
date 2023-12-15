package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");		
		

		//xpath: address of the element in HTML DOM
		//1. absolute xPath: /html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/h4/a
		//2. relative xPath: using element attributes with xpath functions
		
		//htmltag[@attrName='value']
		//input[@name='search']
		//input[@placeholder='Search']
		//input[@id='input-email'] -- xpath vs id
		
		//htmltag[@attr1='value' and @attr2='value']
		//input[@type='text' and @name='search'] -- 1 of 1
		
		//input[@type='text' and @name='search' and @placeholder='Search']
		//input[@type='text' or @type='email' or @type='password']
		
		//input[@id] -- 6 --> FEs
		//a -- 81 --> FEs
//		int linksCount = driver.findElements(By.xpath("//a")).size();
//		System.out.println(linksCount);
//		
//		//input[@id and @type]
//		//a[@class='list-group-item'] -- 13 -- FEs
//		//driver.findElements(By.className("list-group-item"));
//		List<WebElement> linksList = driver.findElements(By.xpath("//a[@class='list-group-item']"));
//		
//		System.out.println(linksList.size());
//		
//		for(WebElement e : linksList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		
		//*[@attrName='value']
		//htmltag[@attrName='value']
		
		//* -- total elements on the page -- 322
		
		//322 elements
		//*[@class='form-control'] -- 6 out of 322
		//input[@class='form-control'] -- 6 out of 14
		
		//input[@value]
		
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
		//text() in xpath: headers, links, spans, P
		//htmltag[text()='value']
		//h2[text()='Returning Customer']
		//h2[text()='New Customer']
		//a[text()='Recurring payments']
		//a[text()='Forgotten Password'] -- 2 -- FEs -- size() -- 2==2 --true -- PASS
		
		//text() with attribute:
		//htmltag[text()='value' and @attr='value']
		//a[text()='My Account' and @class='list-group-item']
		//a[@class='list-group-item' and text()='My Account']
		//a[@class='list-group-item' and text()='Forgotten Password']
		
		//htmltag[text()='value' and @attr1='value' and @attr2='value']
		
		//contains() in xpath:
		//contains() with attribute:
		//htmltag[contains(@attr, 'value')]
		//input[contains(@placeholder, 'E-Mail')]
		//input[contains(@placeholder, 'Address')]
		//input[contains(@id, 'email')]
		//input[contains(@id, 'email') and @type='text' and contains(@placeholder, 'E-Mail')]
		
		//input[contains(@id, 'email')]
		//input[@id='input-email']
		
		//when to use contains()?
		//1. long text:
		//contains() with text():
		//htmltag[contains(text(),'value')]
		//h2[contains(text(),'Returning')]
		//p[contains(text(),'By creating an account')]
		
		//contains() with text() and attribute:
		//htmltag[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Password') and contains(@class,'list-group-item')]
		
		//2. dynamic attributes:
		//dynamic id:
		//<input id = firstname_123>
		//<input id = firstname_125>
		//<input id = firstname_126>
		//<input id = firstname_120>
		//driver.findElement(By.id("firstname_123")).sendKeys("test");//---invalid
		
		//input[contains(@id,'firstname_')]
		
		//starts-with() in xpath:
		//htmltag[starts-with(text(),'value')]
		//p[starts-with(text(),'By creating an account')]
		
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@id,'firstname')]
		
		//ends-with() in xpath: deprecated -- not valid now
		
		
		//id - unique -- By.id(naveen);
		//xpath with id --> //input[@id='naveen']
		
		//space with text:
		//label[normalize-space()='Yes']
		
		
		//index:
		// (//input[@class='form-control'])[1]
		// (//input[@class='form-control'])[position()=1]
		// (//input[@class='form-control'])[last()]
		// (//input[@class='form-control'])[last()-1]
		// (//label[@class='radio-inline'])[1]/input[@type='radio']
		
		//driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("naveen");
		
//		String text = driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]")).getText();
//		System.out.println(text);
//		if(text.equals("Help")) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
		
		//parent to child:
		//direct child: /
		//indirect + direct child: //
		//form[@id='form-currency']//ul[@class='dropdown-menu']//button -- 3
		
		
		//child to parent:
		//input[@name='email']/../../../../../../../../../..
		
		//input[@name='email']/../label[@for='input-email']
		//input[@name='email']/parent::div/label[@for='input-email']
		//input[@name='email']/parent::div/child::label[@for='input-email']
		
		//input[@name='firstname']/../../label[@for='input-firstname']
		//input[@name='firstname']/parent::div/parent::div/child::label[@for='input-firstname']
		
		//input[@name='firstname']/ancestor::div[@class='form-group required']/label[@for='input-firstname']
		
		
		
		//child-->parent --> child
		
		
		//child-parent-precedingsibling-child
		//input[@name='firstname']/parent::div/preceding-sibling::label
		
		//input[@name='password']/preceding-sibling::label
		
		
		//amazon:
		//a[text()='Careers']/ancestor::ul/preceding-sibling::div
		
		//label[text()='Password']/following-sibling::input[@id='input-password']
		
		
		//parent, child, sibling, preceding, following, descendant ---> xpath axes
		
		
		
	}
	
	

}
