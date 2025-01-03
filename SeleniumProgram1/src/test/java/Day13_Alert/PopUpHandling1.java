package Day13_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtil;

public class PopUpHandling1 extends SeleniumUtil{

	public static void main(String[] args) {
		PopUpHandling1 ref=new PopUpHandling1();	
		//ref.HandleAlertPopup();
		//ref.HandleConfirmationPopuP();
		ref.HandlePromptPopup();
}
	/*public void HandleAlertPopup() {
	WebDriver driver=setUp("Chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	ClickOnElement(driver.findElement(By.xpath("//button[text()='Try it']")));
	System.out.println("Alert msg="+driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	}*/
	
		
	public void HandleConfirmationPopuP()
	{
	  WebDriver driver=setUp("Chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	  driver.switchTo().frame("iframeResult");
	  ClickOnElement(driver.findElement(By.xpath("//button[text()='Try it']")));
	  System.out.println("confirm msg="+driver.switchTo().alert().getText());
	  driver.switchTo().alert().accept();
	  System.out.println("button operation="+driver.findElement(By.id("demo")).getText());
	}
	
   public void HandlePromptPopup() {
	   WebDriver driver=setUp("Chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	   driver.switchTo().frame("iframeResult");
	   ClickOnElement(driver.findElement(By.xpath("//button[text()='Try it']")));
	   System.out.println("Prompt msg="+driver.switchTo().alert().getText());
	   driver.switchTo().alert().sendKeys("pune");
		driver.switchTo().alert().accept();
		System.out.println("Button operation ="+driver.findElement(By.id("demo")).getText());
		

		  
   }
   }
	
