package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		googlesearchtest();
	}

	public static void googlesearchtest() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		GoogleSearchPageObjects searchpageobj = new GoogleSearchPageObjects(driver);

		driver.get("https://google.co.in");		
		searchpageobj.settextinsearchbox("a b c d");
		Thread.sleep(3000);
		searchpageobj.clicksearchbutton();
		driver.close();
	}

}
