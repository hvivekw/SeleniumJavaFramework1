package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {

	public static void main(String[] args) throws InterruptedException {

		test();
	}
	public static void test() throws InterruptedException{

		//headless mode Chrome
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1920,1080");

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);		

		driver.get("http://www.google.co.in");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("abcd");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();

		driver.close();
		driver.quit();
		System.out.println("Test is completed");

	}

}
