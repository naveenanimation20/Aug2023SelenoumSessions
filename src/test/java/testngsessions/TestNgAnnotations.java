package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	//before -- test -- after
	
	
	
//	BS -- connect with DB
//	BT -- create user
//	BC -- launch Browser
//	
		//	BM -- loginToApp
		//	add to cart test
		//	AM -- logout
//	
		//	BM -- loginToApp
		//	checkout test
		//	AM -- logout
//	
		//	BM -- loginToApp
		//	search test
		//	AM -- logout
//	
//	AC -- close browser
//	AT -- delete user
//	AS -- disconnect With DB

	

	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connect with DB");
	}

	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- create user");
	}

	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch Browser");
	}

	//4 //7 //10
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- loginToApp");
	}

	//11
	@Test
	public void searchTest() {
		System.out.println("search test");
	}

	//5
	@Test(invocationCount = 3)
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

	//8
	@Test
	public void checkOutTest() {
		System.out.println("checkout test");
	}

	//6 //9 //12
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close browser");
	}

	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- delete user");
	}

	//15
	@AfterSuite
	public void diconnectWithDB() {
		System.out.println("AS -- diconnect With DB");
	}

}
