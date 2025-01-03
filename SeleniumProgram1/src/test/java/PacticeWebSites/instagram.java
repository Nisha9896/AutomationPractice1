package PacticeWebSites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://www.instagram.com");
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc@gmail.com");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
   // driver.findElement(By.xpath("//div[text()='Log in']")).click();
    WebElement login=driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(3)"));
    login.click();
	}

}
