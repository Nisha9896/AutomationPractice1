package MouseOver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// to open browser on full screen
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ibm3/timetrack/enter.do");
		//1vhfr@soscandia.org :Admin01
		
		driver.findElement(By.id("username")).sendKeys("Admin01",Keys.chord(Keys.CONTROL,"a"),
				                  							     Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),
		                               Keys.chord(Keys.ENTER));
		
	}

}    
