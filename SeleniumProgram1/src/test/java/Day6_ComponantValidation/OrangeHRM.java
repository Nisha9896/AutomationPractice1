package Day6_ComponantValidation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    String username=driver.findElement(By.tagName("p")).getText();
	    		//String username1=username.getText();
	    //WebElement username=driver.findElement(By.className("username"));		
	    	    System.out.println(username);
	    	   /* String[] strUser=username1.split(" ", 3);
	    	    for (int i=0;i<strUser.length;i++) {
	    	     
	    	     if (i==2) {
	    	      System.out.println(strUser[i]);
	    	      driver.findElement(By.name("username")).sendKeys(strUser[i]);
	    	     }
	    	    }*/
	    	    
	    	    //WebElement Password	=driver.findElement(By.className("oxd-text "));   
	    // WebElement Password=driver.findElement(By.tagName("p"));
		 // System.out.println(Password);
	  }
	  
	    
	    
	    	    
	      
	}
	


