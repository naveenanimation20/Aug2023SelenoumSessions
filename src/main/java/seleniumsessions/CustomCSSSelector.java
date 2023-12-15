package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		
		//css selector -- locator approach
		//id --> #id
		//class --> .class
		
		// #input-firstname
		// input#username
		By.cssSelector("#input-firstname");
		
		// .form-control
		//input.form-control
		
		// #id.class : #input-firstname.form-control
		// .class#id : .form-control#input-firstname
		
		//.c1.c2.c3...cn
		//.form-control.input-lg
		//.form-control.private-form__control.login-email
		//.form-control.private-form__control.login-email#username
		//#username.form-control.private-form__control.login-email
		
		//other attributes: type, name, any other attributes
		// htmltag[attr='value'] -- css
		// //htmltag[@attr='value'] -- xpath
		
		// input[name='email']
		//By.cssSelector("input[name='email']");
		// input[id='input-email']
		
		// htmltag[attr1='value'][attr2='value']
		// input[name='email'][placeholder='E-Mail Address'][type='text']
		// input[name][placeholder][type]
		
		// input[name='email']#input-email
		// input#input-email[name='email']
		
		
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("naveen@gmail.com");//invalid
		//InvalidSelectorException: Compound class names not permitted
		
		//driver.findElement(By.className("login-email")).sendKeys("naveen@gmail.com"); //valid
		
		//driver.findElement(By.className("private-form__control login-email")).sendKeys("naveen@gmail.com"); //invalid


		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("nav@gmail.com");//valid
		
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("test@gmail.com");//valid
		
		// input.form-control.private-form__control.login-email
		// input#username
		
		
		//driver.findElement(By.xpath("//input[@@@@id,'username']")).sendKeys("test");//InvalidSelectorException: invalid selector
		
		//text in css: Not available
		
		//htmltag[attr*='value'] -- contains
		// input[placeholder*= 'E-Mail'] -- contains
		// input[placeholder^='E-Mail'] -- startswith
		// input[placeholder$='Address'] -- endswith
		
		//parent to child:
		
		//select[@id='Form_getForm_Country']/option -- xpath
		// select[id='Form_getForm_Country'] > option -- css -- direct child element : parent > child
		
		// div#content > input -- 0 direct
		// div#content input -- 11 -- direct+indirect child elements
		
		//child to parent: not allowed -- backward traversing is not allowed in CSS
		//child to ancestor: not allowed
		//preceding sibling: not allowed
		
		//sibling in css:
		// label[for='input-email']+input --> immediate sibling
		// label[for='input-email']~input --- all siblings
		
		
		//comma in css:
		// input#username,input#password,button#loginBtn,input#remember
		
		int loginEles = driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,input#remember")).size();
		System.out.println(loginEles);
		
		if(loginEles == 4) {
			System.out.println("all imp elememts are present on login page");
		}
		else {
			System.out.println("FAIL");
		}
		
		
		//not in css:
		// div[class='form-group'] > input:not(#input-password)
		// div[class='form-group'] > input:not(input[type='password'])
		
		// div[class='form-group'] > input:not(input[type='password'], #input-email)
		
		//indexing in css:
		// select[id='Form_getForm_Country'] > option:nth-of-type(15)
		// select[id='Form_getForm_Country'] > option:nth-of-type(n) -- all
		
		
				// select#Form_getForm_Country option:first-child
		
				// select#Form_getForm_Country option:last-child
		
				// select#Form_getForm_Country option:nth-child(5)
		
				// select#Form_getForm_Country option:nth-last-child(2)
		
				// select#Form_getForm_Country option:nth-child(odd)
		
				// select#Form_getForm_Country option:nth-child(even)
		
				// select#Form_getForm_Country option:nth-child(n+4)
		
				// select#Form_getForm_Country option:nth-child(4n)
				
				
		
		
		//odd/even in xpath:
		// num % 2 == 0
		//table//tobdy//tr[postion() mod 2 =1]  -- for odd
		//table//tobdy//tr[postion() mod 2 =!1]  -- for even
		
		// (//select[@id='Form_getForm_Country']/option)[position() mod 2 = 0] -- even
		// (//select[@id='Form_getForm_Country']/option)[position() mod 2 = 1] -- odd
		
		
		//                  xpath     vs          css:
		//1. syntax: 	  	complex				simple
		//2. performance:    good				good
		//3. backward:		yes					no
		//4. sibling:       yes                 yes -- only following
		//5. text:          yes                 no
		//6. ancestor:      yes                 no
		//7. index:         yes                 yes+1
		//8. comma:         no                  yes
		//9. not:           no                   yes
		//10.SVG:           yes                  no
		//11. shadowDOM:    no                  yes
		//12. endswith      no                  yes
		
		
		
		
		
	}

}
