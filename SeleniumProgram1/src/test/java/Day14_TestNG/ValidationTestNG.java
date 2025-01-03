package Day14_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.SeleniumUtil;

public class ValidationTestNG extends SeleniumUtil {
  @Test
  public void ActiTime() {
	   WebDriver driver =setUp("Chrome","https://online.actitime.com/ubs/login.do");
	   typeRequiredText(driver.findElement(By.id("username")),"admin01");
	   typeRequiredText(driver.findElement(By.name("pwd")),"admin01");
	   ClickOnElement(driver.findElement(By.id("loginButton")));
      
       String ExpectedTitle="actiTime Enter Time-Track";
       String actualTitle=getApplicationTitle();
       System.out.println("Is Login Successul="+actualTitle.equals(ExpectedTitle));
	 }
  @Test
  public void ActiTimeLogin() {
	  WebDriver driver= setUp("edge", "https://online.actitime.com/ubs/login.do");
		 typeRequiredText(driver.findElement(By.id("username")), "admin01");
		 typeRequiredText(driver.findElement(By.name("pwd")), "admin01");
		 ClickOnElement(driver.findElement(By.id("loginButton")));
		 
		 String expectedTitle="actiTIME - Enter Time-Track";
		 String actualTitle=getApplicationTitle();
		 //System.out.println("Is login successful? "+actualTitle.equals(expectedTitle));
		 
		 //Assert.assertEquals(actualTitle, expectedTitle);
		 Assert.assertEquals(actualTitle, expectedTitle,"Login failed, either title changes or invalid password entered");
	   }
  @Test(enabled=true, priority=3)
  public void testOrangeHRMLoginWithAssert2() {
	 WebDriver driver= setUp("edge", "https://online.actitime.com/ubs/login.do");
	 typeRequiredText(driver.findElement(By.id("username")), "admin01");
	 typeRequiredText(driver.findElement(By.name("pwd")), "admin01");
	 ClickOnElement(driver.findElement(By.id("loginButton")));
	 
	 String expectedTitle="actiTIME - Enter Time-Track";
	 String actualTitle=getApplicationTitle(expectedTitle);
	 //System.out.println("Is login successful? "+actualTitle.equals(expectedTitle));
	 
	 //Assert.assertEquals(actualTitle, expectedTitle);
	 Assert.assertEquals(actualTitle, expectedTitle,"Login failed, either title changes or invalid password entered");
  }
  @Test(enabled=true, priority=2)
  public void testOrangeHRMUsernameField() {
	 WebDriver driver= setUp("edge", "https://online.actitime.com/ubs/login.do");	 
	 boolean res=driver.findElement(By.id("username")).isDisplayed();
	 Assert.assertTrue(res);
	 Assert.assertTrue(res,"Either application is not loaded or username input field is not available in the screen");
  }
}