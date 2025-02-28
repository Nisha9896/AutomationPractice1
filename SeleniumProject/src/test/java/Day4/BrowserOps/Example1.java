package Day4.BrowserOps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(600,800));
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.findElement(By.className("orangehrm-login-forgot")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.google.com");
        driver.navigate().refresh();
	}

}
