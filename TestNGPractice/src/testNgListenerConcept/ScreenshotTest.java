package testNgListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void loginTest() {
		Assert.assertEquals(false, true); //make TestCase to fail
	}
	
	@Test
	public void searchTest() {
		Assert.assertEquals(false, true); //make TestCase to fail
	}
	
	@Test
	public void createDealsTest() {
		Assert.assertEquals(false, true); //make TestCase to fail
	}
	
	@Test
	public void createContactsTest() {
		Assert.assertEquals(false, true); //make TestCase to fail
	}
	
	@Test
	public void homePageTest() {
		Assert.assertEquals(false, true); //make TestCase to fail
	}
}