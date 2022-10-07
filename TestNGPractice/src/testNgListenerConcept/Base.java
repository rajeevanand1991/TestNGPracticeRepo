package testNgListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	public void failed(String testMethodName) {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			System.out.println("============> "+scrFile.getPath());
			//This approach is to append current class name with screenshot name
			//FileUtils.copyFile(scrFile, new File("E:\\eclipseWorkspace\\TestNGPractice\\screenshots\\"+"failshot_"+this.getClass().getName()+"_"+".jpg"));
			
			//This approach is to append every method name with screenshot name
			FileUtils.copyFile(scrFile, new File("E:\\eclipseWorkspace\\TestNGPractice\\screenshots\\"+"failshot_"+testMethodName+"_"+".jpg"));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}