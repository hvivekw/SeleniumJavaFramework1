package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1_googlesearch {

	public static void main(String[] args) {

		googlesearch();
	}

	public static void googlesearch(){

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");

		driver.findElement(By.id("lst-ib")).sendKeys("Automation Step By Step");

		//driver.findElement(By.name("btnK")).click();

		//pressing enter button on keyboard instead of click
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		System.out.println("Found and clicked on Search button");

		driver.close();		
	}
}
