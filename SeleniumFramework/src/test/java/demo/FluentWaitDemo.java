package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	private static final TimeUnit SECONDS = null;
	public static void main(String[] args) throws InterruptedException {
		test();
	}
	public static void test() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.co.in");
		driver.findElement(By.name("q")).sendKeys("abcd");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();

//		driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH")).click();

/*		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, SECONDS)
				.pollingEvery(2, SECONDS)
				.ignoring(NoSuchElementException.class);*/
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(30))
		            .pollingEvery(Duration.ofMillis(2000))
		            .ignoring(WebDriverException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement LinkElement =  driver.findElement(By.xpath("/html//div[@id='rso']//div[@class='srg']/div[7]/div//a[@href='https://data-archive.nimh.nih.gov/abcd']/h3[@class='LC20lb']"));

				if(LinkElement.isEnabled()){
					System.out.println("Element found");
				}
				return LinkElement;
			}
		});
		
		element.click();

		Thread.sleep(3000);
		driver.close();
		driver.quit();	
	}

}
