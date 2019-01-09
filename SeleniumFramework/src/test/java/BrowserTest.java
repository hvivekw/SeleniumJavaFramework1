

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		//driver.findElement(By.id("lst-ib")).sendKeys("Automation Step By Step");
		
		//WebElement TextBox = driver.findElement(By.id("lst-ib"));
		//TextBox.sendKeys("Automation Step By Step");
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Step By Step");
		
		List<WebElement> list = driver.findElements(By.xpath("//input"));		
		int count = list.size();		
		System.out.println("count is " + count);
			
	}
}
