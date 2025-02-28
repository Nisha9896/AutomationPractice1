package Day4.BrowserOps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.className("ico-register")).click();
	driver.navigate().back();
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.id("FirstName")).sendKeys("nisha");
	driver.navigate().refresh();
	driver.navigate().back();
	driver.findElement(By.className("ico-login")).click();
	
	//driver.navigate().to("")
	}

}
