package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;

	@BeforeTest
	@Parameters("browserName")
	public void setup(String browserName){
		System.out.println("Browser name is:"+ browserName);
		System.out.println("Thread id is" + Thread.currentThread().getId());

		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie .driver", "C:\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

	}

	@Test
	public void test1() throws InterruptedException{

		driver.get("http://www.google.co.in");
		Thread.sleep(4000);

	}

	@AfterTest
	public void teardown(){
		driver.close();
		System.out.println("Test Completed successfully");
	}

}
