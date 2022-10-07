package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGpractice {
	
	//Pre-conditions annotations -- starting with @Before
	@BeforeSuite //1
	public void setUp() { //Setup system property for chrome
		System.out.println("Setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("launch chrome Browser");
	}
	
	@BeforeClass //3
	public void login() {
		System.out.println("login to app");
	}
	
	/*	@BeforeMethod
		@Test - 1
		@AfterMethod
		
		@BeforeMethod
		@Test - 2
		@AfterMethod*/
	
	@BeforeMethod //4 for first Test Case and 7 for second Test case
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	//TestCases -- starting with @Test 
	@Test //5
	public void googleTitleTest() {
	System.out.println("Google Title Test case PASS... :)");
	}
	
	@Test //8
	public void searchTest() {
	System.out.println("searchTest case PASS... :)");
	}
	
	//post conditions -- starting with @After
	@AfterMethod //6 for first Test Case and 9 for second Test case
	public void logout() {
		System.out.println("logout from app");
	}
	
	@AfterClass //10
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	@AfterTest //11
	public void deleteCookies() {
		System.out.println("delete cookies...");
	}
	
	@AfterSuite //12
	public void generateTestReport() {
		System.out.println("generateTestReport");
	}
}