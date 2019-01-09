package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {

	@Test
	public void test1(){
		System.out.println("I am inside test1");
	}
	
	@Test
	public void test2(){
		System.out.println("I am inside test2");
		//Assert.assertTrue(false);
		
/*		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Step By Step");
		driver.findElement(By.xpath("//input[@name='kkk']")).sendKeys("Automation Step By Step");
		driver.close();*/
	}
	
	@Test
	public void test3(){
		System.out.println("I am inside test3");
		//throw new SkipException("This test is skipped");
	}
}
