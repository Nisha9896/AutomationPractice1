package MouseOver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://online.actitime.com/ibm3/timetrack/enter.do");
    driver.findElement(By.id("username")).sendKeys("Admin01");
    Thread.sleep(1000);
    driver.findElement(By.name("pwd")).sendKeys(Keys.F5);
	}

}
