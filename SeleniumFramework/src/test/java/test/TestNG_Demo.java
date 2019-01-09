package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo {

	WebDriver driver = null;
	public static String browserName = null;

	@BeforeTest
	public void setuptest(){

		PropertiesFile.getProperties();
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.11.1-win64\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	@Test
	public void googlesearch() throws InterruptedException{


		driver.get("https://google.co.in");

		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");

		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		//pressing enter button on keyboard instead of click
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void setupteardown(){

		driver.close();	
		//driver.quit();
		System.out.println("Found and clicked on Search button");
		PropertiesFile.setProperties();
	}
}
