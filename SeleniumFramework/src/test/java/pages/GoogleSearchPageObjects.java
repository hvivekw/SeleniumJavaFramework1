package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

	WebDriver driver = null;
	
	public GoogleSearchPageObjects(WebDriver driver){
		this.driver = driver;
	}
	
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
	
	public void settextinsearchbox(String text){
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clicksearchbutton(){
		//driver.findElement(button_search).sendKeys(Keys.RETURN);
		driver.findElement(button_search).click();
	}
}
