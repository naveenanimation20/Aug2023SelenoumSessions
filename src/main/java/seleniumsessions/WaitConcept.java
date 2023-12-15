package seleniumsessions;

public class WaitConcept {

	public static void main(String[] args) {

		//selenium script ----> brwoser -- application
		//sync b/w script and application
		
		
		//waits: 
		//1. static wait: Thread.sleep(10000): pause the script for 5 secs
		//2. dynamic wait: wait(10 secs) --> 2 secs: 8 secs will be canceled
			//2.a: Implicitly Wait:
			//2.b: Explicit Wait:
					//2.b.1: WebDriver Wait
					//2.b.2: Fluent Wait
		
		
	//wait(I) until(); 	<---- FluentWait (Class) until(){} + other methods <---- WebDriverWait(class)
		
	//imp(10) + exp(20) wait together: avoid
//e1  2   +     5 == 7
//	  10  +     2 == 12
//	 0    +     15 == 15
//	 10+     20 = 30
	 
		
		
		
	}

}
