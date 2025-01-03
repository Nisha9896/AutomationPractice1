package Day13_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtil;

public class Demoqa_PopUp extends SeleniumUtil{
	
	public static void main(String[] args) {
		Demoqa_PopUp ref=new Demoqa_PopUp();
		//ref.AlertPopUp();
		//ref.ConfirmationAlertPopUp();
		ref.PromptPopup();
	}
	public void AlertPopUp() {
      WebDriver driver=setUp("Chrome","https://demoqa.com/alerts");
      ClickOnElement(driver.findElement(By.id("alertButton")));
      System.out.println("button Text="+driver.switchTo().alert().getText());
      driver.switchTo().alert().accept();
      }
	public void ConfirmationAlertPopUp() {
	      WebDriver driver=setUp("Chrome","https://demoqa.com/alerts");
	      ClickOnElement(driver.findElement(By.id("confirmButton")));
	      System.out.println("button Text="+driver.switchTo().alert().getText());
	      driver.switchTo().alert().accept();
	      System.out.println("conformation msg ="+driver.findElement(By.id("confirmResult")).getText());
	      }
	public void PromptPopup() {
	      WebDriver driver=setUp("Chrome","https://demoqa.com/alerts");
	      ClickOnElement(driver.findElement(By.id("promtButton")));
	      System.out.println("button Text="+driver.switchTo().alert().getText());
	     // driver.switchTo().alert().sendKeys("pune");
	      //driver.switchTo().alert().accept();
	    // System.out.println("conformation msg ="+driver.findElement(By.id("promptResult")).getText());
	      }


}
