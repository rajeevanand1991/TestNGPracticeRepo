package TestNGPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayTest {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void setUp() {
		System.out.println("launch chrome browser");
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/"); // Pass application URL here
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void searchTest() {
		driver.findElement(By.name("_nkw")).sendKeys("testing");
		driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")).sendKeys("Music");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}