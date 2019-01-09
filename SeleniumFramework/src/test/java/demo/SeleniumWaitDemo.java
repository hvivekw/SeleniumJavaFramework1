package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		seleniumWaits();
	}

	public static void seleniumWaits() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait
		//250 ms - default frequency of polling 

		driver.get("http://google.co.in");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20); //explicit wait		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
		//driver.findElement(By.name("abcd")).click();

		driver.close();
		driver.quit();	

	}
}
