package singletonConceptforSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {
	
	private static DriverInit instanceDriver = null;
	private WebDriver driver;
	
	private DriverInit() {
		
	}
	
	//This is the utility class / Base class
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static DriverInit getInstance() {
		if(instanceDriver == null) 
			instanceDriver = new DriverInit();
		return instanceDriver;
	}
}