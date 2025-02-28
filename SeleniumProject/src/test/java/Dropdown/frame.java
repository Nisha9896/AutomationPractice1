package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://jqueryui.com/");
	  driver.findElement(By.linkText("Autocomplete")).click();
	  WebElement frm= driver.findElement(By.cssSelector(".demo-frame"));
	  driver.switchTo().frame(frm);
	  driver.findElement(By.id("tags")).sendKeys("nisha");
	 driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
	

}
}