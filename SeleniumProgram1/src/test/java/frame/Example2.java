package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtil;

public class Example2 extends SeleniumUtil{
	

	public static void main(String[] args) throws InterruptedException {
		Example2 ref =new Example2();
	    ref.HandlingFrameUsingIndex();
     	}
	public void HandlingFrameUsingIndex() throws InterruptedException {
		
	WebDriver driver=setUp("Chrome","https://jqueryui.com/");
	ClickOnElement(driver.findElement(By.linkText("Checkboxradio")));
	
	WebElement frm=driver.findElement(By.cssSelector(".demo-frame"));
	driver.switchTo().frame(frm);
	typeRequiredText(driver.findElement(By.id("tags")), "ja");
	Thread.sleep(1000);
	driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	//to perform operation on the element present outside the frame, dn switch to main page
	driver.switchTo().defaultContent();
	ClickOnElement(driver.findElement(By.cssSelector(".logo")));
	}
}
