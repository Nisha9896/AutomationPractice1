package KeyBoardMouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eample1_DemoWebShop {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://demowebshop.tricentis.com");
    
    driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
    driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
    driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);
    driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);


    
	}

}
