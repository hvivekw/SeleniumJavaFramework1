package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {

    static WebDriver driver = null;
	public static void main(String[] args) {

		googlesearch();
	}

	public static void googlesearch(){

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.co.in");

		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step By Step");

		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);

		System.out.println("Found and clicked on Search button");

		driver.close();		
	}
}
