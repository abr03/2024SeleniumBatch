package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataprovider.ConfigReader;

public class BrowserFactory {
	
	public static WebDriver getDriver(String browser, String application) {
		
		WebDriver driver = null;

        if (browser.equalsIgnoreCase(ConfigReader.getValue("browser"))) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Unsupported browser!");
        }

       long pagetime= Long.parseLong(ConfigReader.getValue("pageLoad"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pagetime));
		driver.get(application);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		return driver;

    }
	

}
	

		
	
