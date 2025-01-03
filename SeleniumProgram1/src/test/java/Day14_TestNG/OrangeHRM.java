package Day14_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.SeleniumUtil;

public class OrangeHRM extends SeleniumUtil{
	
  @BeforeTest
  public void OpenBrowserAndUrl() {
	  setUp("Chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  @BeforeMethod
  public void login()
  {
	  typeRequiredText(driver.findElement(By.name("username")),"Admin");
      typeRequiredText(driver.findElement(By.name("password")),"admin123");
      ClickOnElement(driver.findElement(By.className("orangehrm-login-button")));
	  System.out.println("\tLogin into application");
  }
  @Test(priority=1)
  public void createPIM() {
	  ClickOnElement(driver.findElement(By.xpath("//li/a/span[text()='PIM']")));
      ClickOnElement(driver.findElement(By.xpath("//a[text()='Add Employee']")));
      typeRequiredText(driver.findElement(By.name("firstName")),"Nisha");
      typeRequiredText(driver.findElement(By.name("middleName")),"abc");
      typeRequiredText(driver.findElement(By.name("lastName")),"XYZ");
      ClickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
      ClickOnElement(driver.findElement(By.xpath("//li/a/span[text()='PIM']")));
      System.out.println("\t\tPIM is created and validated");
  }
	@Test(priority=2)
	public void updatePIM() throws InterruptedException
	{
	      //ClickOnElement(driver.findElement(By.xpath("//li/a/span[text()='PIM']")));
	      typeRequiredText(driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")),"Nisha");
	      ClickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
	      ClickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div/div/div/div/label/span")));
	      ClickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-container']/div[1]/div[2]/div/div/div[9]/div/button")));
	      
	      typeRequiredText(driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee']/div[2]/div/form/div[2]/div[2]/div/div/div[2]/input")),"8");
	      ClickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-card-container']/div/div[2]/div/form/div[4]/button")));
	      Thread.sleep(1000);
	      System.out.println("\t\tPIM is updated and validated");
	 		
	} 
	@Test(priority=3)
	public void DeletePIM()
	{
		// ClickOnElement(driver.findElement(By.xpath("//li/a/span[text()='PIM']")));
	     typeRequiredText(driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")),"Nisha");
	     ClickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
	     ClickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-background-container']/div[2]/div[3]/div/div/div/div/div/label/span")));
	     ClickOnElement(driver.findElement(By.xpath("//div[@class='oxd-table-body']/div/div/div[9]/div/button[2]")));
	     ClickOnElement(driver.findElement(By.xpath("//div[@role='document']/div[3]/button[2]")));
	     System.out.println("Successfully Deleted");
	}
	  }
  /*
@Test
public void testPIMCreation() {
	//open browser
	//enter username
	//enter password
	//click on login button
	//click on PIM
	//click on +Add
	//fill required details
	//click on save button
	//click on PIM
	//search by created ID
	//validate it
}
@Test
public void testPIMUpdate() {
	//click on PIM
	//search by created ID
	//edit it
	//search by created ID
	//validate it
}
@Test
public void testPIMDelete() {
	//click on PIM
	//search by created ID
	//delete it
	//search by created ID
	//validate it
}
*/

