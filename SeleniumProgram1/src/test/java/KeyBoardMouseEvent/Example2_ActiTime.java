package KeyBoardMouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_ActiTime {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://online.actitime.com/ubs/login.do");
		    
		    WebElement username=driver.findElement(By.id("username"));
		    username.sendKeys("admin01",Keys.chord(Keys.CONTROL,"a"));
		    username.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		    
		    WebElement password=driver.findElement(By.name("pwd"));
		    password.sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
		    
		   // driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		    
		    
	}

}
