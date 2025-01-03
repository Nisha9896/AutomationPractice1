package Day14_TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utilities.SeleniumUtil;

public class OrangeHRM1 extends SeleniumUtil {
  @Test
  public void PIM() throws InterruptedException {
	  setUp("Chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  typeRequiredText(driver.findElement(By.name("username")),"Admin");
      typeRequiredText(driver.findElement(By.name("password")),"admin123");
      ClickOnElement(driver.findElement(By.className("orangehrm-login-button")));
	  System.out.println("\tLogin into application");
	  ClickOnElement(driver.findElement(By.xpath("//li/a/span[text()='PIM']")));
      ClickOnElement(driver.findElement(By.xpath("//a[text()='Add Employee']")));
      typeRequiredText(driver.findElement(By.name("firstName")),"Nisha");
      typeRequiredText(driver.findElement(By.name("middleName")),"abc");
      typeRequiredText(driver.findElement(By.name("lastName")),"XYZ");

      ClickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
      ClickOnElement(driver.findElement(By.xpath("//li/a/span[text()='PIM']")));
      System.out.println("\t\tPIM is created and validated");
     
           
	  typeRequiredText(driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")),"Nisha");
      ClickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
      ClickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div/div/div/div/label/span")));
      ClickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-container']/div[1]/div[2]/div/div/div[9]/div/button")));
    
      //EDIT 
     Thread.sleep(1000);
	 typeRequiredText(driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee']/div[2]/div/form/div[2]/div[2]/div/div/div[2]/input")),"8");
     ClickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-card-container']/div/div[2]/div/form/div[4]/button")));
     Thread.sleep(1000);
     
     //Delete
     ClickOnElement(driver.findElement(By.xpath("//li/a/span[text()='PIM']")));
     typeRequiredText(driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")),"Nisha");
     ClickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
     ClickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-background-container']/div[2]/div[3]/div/div/div/div/div/label/span")));
     ClickOnElement(driver.findElement(By.xpath("//div[@class='oxd-table-body']/div/div/div[9]/div/button[2]")));
     ClickOnElement(driver.findElement(By.xpath("//div[@role='document']/div[3]/button[2]")));
     System.out.println("Successfully Deleted");
      
      
  }
}
