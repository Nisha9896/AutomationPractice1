package KeyBoardMouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_ActiTime {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://online.actitime.com/ubs/login.do");
	    WebElement username=driver.findElement(By.id("username"));
	    username.sendKeys("admin01");
	    Actions act=new Actions(driver);
	    act.moveToElement(username).doubleClick().build().perform();
	    username.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	    driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
	    
	    }

}
