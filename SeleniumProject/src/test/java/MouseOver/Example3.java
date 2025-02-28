package MouseOver;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// to open browser on full screen
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ibm3/timetrack/enter.do");
		driver.findElement(By.id("username")).sendKeys("Admin01");
		//Action action=new Action(driver);
	}
}
