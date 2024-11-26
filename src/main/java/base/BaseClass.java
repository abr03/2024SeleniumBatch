package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeClass
	public void browsersetup() {
		
		System.out.println("LOG INFO--Setiing up browser");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("LOG INFO--Closing browser");
		driver.quit();
		System.out.println("LOG INFO--Application and browser closed");

	}
}
