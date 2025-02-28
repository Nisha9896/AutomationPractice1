import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram_TestCase {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com");
		
		driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d _ap35']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");

	}

}
