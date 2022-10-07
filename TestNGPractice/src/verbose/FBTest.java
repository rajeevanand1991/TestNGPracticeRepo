package verbose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
	public void fbTitleTest1() {
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test(priority=2)
	public void fbTitleTest2() {
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Assert.assertEquals(title, "Facebook – log in or sign up123");
	}
	
	@Test(priority=3)
	public void fbTitleTest3() {
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Assert.assertEquals(title, "Facebook – log in or sign up456");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}