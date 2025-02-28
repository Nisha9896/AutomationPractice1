package CSS_Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoWebShop {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/register");
	
	driver.findElement(By.id("register-button")).click();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20)); 
   
	//FirstName 
	WebElement FirstName = driver.findElement(By.id("FirstName"));
	Point FirstNamePoint = FirstName.getLocation();
	int FirstName_x = FirstNamePoint.getX();
	int FirstName_y = FirstNamePoint.getY();

	WebElement FirstNameError = driver.findElement(By.className("field-validation-error"));
    System.out.println("FirstName Error color = "+FirstNameError.getCssValue("color"));	
    System.out.println("FirstName Error font Family = "+FirstNameError.getCssValue("font-family"));
    System.out.println("FirstName Error font Size = "+FirstNameError.getCssValue("font-size"));

	Point FirstNameErrorPoint = FirstNameError.getLocation();
	int FirstNameError_x = FirstNameErrorPoint.getX();
	int FirstNameError_y = FirstNameErrorPoint.getX();

	System.out.println("Error msg should be on same line as firstname="+(FirstName_x<FirstNameError_x));
	
	//LastName
	WebElement LastnameError=driver.findElement(By.className("field-validation-error"));
	System.out.println("LastName Error color = "+LastnameError.getCssValue("color"));
	System.out.println("LastName Error font family = "+LastnameError.getCssValue("font-family"));
	System.out.println("LastName Error font size = "+LastnameError.getCssValue("font-size"));
	Point LastnameErrorPoint = LastnameError.getLocation();
	int LastName_X=LastnameErrorPoint.getX();
	int LastName_Y=LastnameErrorPoint.getY();
	
	WebElement LastName=driver.findElement(By.id("LastName"));
	Point LastnamePoint= LastName.getLocation();
	int LastnamePoint_X=LastnamePoint.getX();
	int LastnamePoint_Y=LastnamePoint.getY();
	System.out.println("Error msg should be on same line as firstname = "+(LastName_X>LastnamePoint_X));
	
	//Gmail
	WebElement GmailError=driver.findElement(By.className("field-validation-error"));
	System.out.println("Gmail Error color = "+GmailError.getCssValue("color"));
	System.out.println("Gmail Error font family = "+GmailError.getCssValue("font-family"));
	System.out.println("Gmail Error font size  = "+GmailError.getCssValue("font-size"));
    Point GmailPoint=GmailError.getLocation();
    int GmailPoint_X=GmailPoint.getX();
    int GmailPoint_Y=GmailPoint.getY();
    
    WebElement gmail=driver.findElement(By.id("Email"));
    Point gmailpoint=gmail.getLocation();
    int Gmail_x=gmailpoint.getX();
    int Gmail_y=gmailpoint.getY();

	System.out.println("Error msg should be on same line as firstname = "+(Gmail_x<GmailPoint_X) );
	
	//password
	WebElement password=driver.findElement(By.id("Password"));
	Point passwordPoint=password.getLocation();
	int password_x=passwordPoint.getX();
	int password_y=passwordPoint.getY();

	driver.close();
	}

}
