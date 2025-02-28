package MouseOver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample1 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://online.actitime.com/ibm3/timetrack/enter.do");
    WebElement username=driver.findElement(By.id("username"));
    username.sendKeys("Admin01");
    
    Actions action=new Actions(driver);
    action.moveToElement(username).doubleClick().build().perform();
    
    username.sendKeys(Keys.chord(Keys.CONTROL,"c"));
    driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
    
	}

}
