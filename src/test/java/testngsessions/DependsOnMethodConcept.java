package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void loginTest() {
		System.out.println("login to app");
		int i = 9/0;
	}

	@Test(dependsOnMethods = "loginTest")
	public void searchHomePageTest() {
		//login test
		System.out.println("search test");
	}

	@Test(dependsOnMethods = "searchHomePageTest")
	public void addToCartTest() {
		System.out.println("addToCartTest");
	}
	
	
	//AAA pattern: Arrange, Act, and Assert
	//no dependency
	//no priority
	//test cases/methods should be independent
	
	
	@Test
	public void searchTest() {
		//login(un,pwd)
		//search(macbook)
		//assertion: only one assertion
		//a1: failed
		//a2
		//a5
		
	}
	
	//url, title, logo, login, footer
	//opencarTest() --> 
	

}
