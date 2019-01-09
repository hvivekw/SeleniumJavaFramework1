package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		test();
	}
	public static void test() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.tinyupload.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("uploaded_file")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\AutoIT\\FileUploadScript.exe");
		Thread.sleep(3000);
		driver.close();
	}
}
