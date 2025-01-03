package XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eRail {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://erail.in/");
    WebElement Date=driver.findElement(By.xpath("//input[@title='Select Departure date for availability']"));
    Date.clear();
    Date.sendKeys("17-dec-2024 Tue");
    
	}

}
