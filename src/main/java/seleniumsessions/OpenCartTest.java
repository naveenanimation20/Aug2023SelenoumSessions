package seleniumsessions;

public class OpenCartTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		
		brUtil.launchBrowser("firefox");
		brUtil.launchURL("httpbin.com/opencart/");
		
		String actTitle = brUtil.getPageTitle();
		if(actTitle.equals("Your Store")) {
			System.out.println("title is correct -- PASS");
		}
		else {
			System.out.println("title is incorrect -- FAIL");
		}
		
		String actUrl = brUtil.getPageURL();
		if(actUrl.contains("opencart")) {
			System.out.println("url is correct -- PASS");
		}
		
		
		brUtil.closeBrowser();
		
		
	}

}
