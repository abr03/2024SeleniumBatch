package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class loginTest extends BaseClass{
	
	@Test (description = "Verify Valid login scenerio")
	public void validLoginTest() {
		

		
		
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		driver.findElement(By.className("submit-btn")).click();
		Assert.assertTrue(driver.findElement(By.className("welcomeMessage")).isDisplayed());

		
	}

}
