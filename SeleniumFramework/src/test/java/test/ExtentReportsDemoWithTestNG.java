package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoWithTestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports  extent;

	WebDriver driver;

	@BeforeSuite
	public void setUp(){

		htmlReporter = new ExtentHtmlReporter("extentReports.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@BeforeTest
	public void setuptest(){

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void test1() throws IOException, InterruptedException{

		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

		/*		test.log(Status.INFO, "Starting Test Case");
		test.info("this step shows usage of info(details)");
		test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");*/

		driver.get("https://google.co.in");
		test.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		test.pass("Entered text in text box");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click(); 
		test.pass("Pressed Keyboard Enter key");
	}

	/*	@Test
	public void test2() throws IOException{

		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

		test.log(Status.INFO, "Starting Test Case");
		test.info("this step shows usage of info(details)");
		test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}*/

	@AfterTest
	public void setupteardown(){

		driver.close();	
		driver.quit();
		System.out.println("Found and clicked on Search button");
	}

	@AfterSuite
	public void tearDown(){

		extent.flush();

	}

}
