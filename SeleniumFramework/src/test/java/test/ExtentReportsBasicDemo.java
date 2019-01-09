package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {

	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		ExtentReports  extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Google Search Test One", "test google search");
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://google.co.in");
		test1.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		test1.pass("Entered text in text box");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN); //pressing enter button on keyboard instead of click
		test1.pass("Pressed Keyboard Enter key");		
		driver.close();		
		driver.quit();
		test1.pass("Closed the browser");
		test1.info("Test Completed");
		
		extent.flush(); //write everything to log file

	}

}
