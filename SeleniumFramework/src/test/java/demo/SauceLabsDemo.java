package demo;

import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {
	
	  public static final String USERNAME = "hvivekw";
	  public static final String ACCESS_KEY = "5a2383db-a6f5-447f-80df-ac6755710fb0";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Linux");
	    caps.setCapability("version", "latest");
	    caps.setCapability("name", "GoogleTest1");
	    caps.setCapability("extendedDebugging", "true");
	    caps.setCapability("buildNumber", "3.0");
	 
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
/*	    
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();*/
	    
		driver.get("http://google.co.in");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle());
	 
	    driver.quit();
	    System.out.println("Test completed");
	  }

}
