package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooMailTest {
	
	/*output:
		launch FireFox
			Login to app
				compose mail test
			logout
			Login to app
				search mail test
			logout
			Login to app
				sent Items Mail Test
			logout
		quit browser*/
	
	// 1.
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch FireFox");
	}
	
	// 2 and 5 and 8
	@BeforeMethod
	public void login() {
		System.out.println("Login to app");
	}
	
	// 3.
	@Test(priority=1)
	public void composeMailTest() {
		System.out.println("compose mail test");
	}
	
	// 6.
	@Test(priority=2, enabled=false) //This will make disable this Test alone
	public void deleteMailTest() {
		System.out.println("delete mail test");
	}
	
	// 9.
	@Test(priority=3)
	public void searchMailTest() {
		System.out.println("search mail test");
		int i = 9/0;
	}
	
	@Test(priority=4)
	public void sentItemsMailTest() {
		System.out.println("sent Items Mail Test");
	}
	
	// 4 and 7 and 10
	@AfterMethod
	public void logOut() {
		System.out.println("logout");
	}
	
	// 11.
	@AfterClass
	public void quitBrowser() {
		System.out.println("quit browser");
	}

}
