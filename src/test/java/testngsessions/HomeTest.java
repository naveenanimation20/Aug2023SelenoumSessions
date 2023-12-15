package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest {

	// Python: PyTest/UnitTest
	// .Net: Nunit
	// Java: Junit/TestNG
	// NODE JS: Mocha/Jasmine

	// feature: method: API: WS: white box testing: static analysis
	//test coverage: 100%
	//code coverage: 100%
	//SonarQube, Jacoco, Cobertura
	private int sum(int a, int b) {
		return a + b;
	}
	
	//user: web app: functional testing
	public void calSum(int a, int b) {
		sum(a,b);
	}

	// test - Unit Test + assertion: UT: devs
	@Test
	public void test1() {
		Assert.assertEquals(sum(10, 20), 30);
	}

	@Test
	public void test2() {
		Assert.assertEquals(sum(0, 20), 20);
	}

	@Test
	public void test3() {
		Assert.assertEquals(sum(-10, 20), 10);
	}

	@Test
	public void test4() {
		Assert.assertEquals(sum(-10, -20), -30);
	}

}
