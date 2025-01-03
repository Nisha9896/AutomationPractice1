package PacticeWebSites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://www.flipkart.com");
	   //driver.findElement(By.xpath("//form[@class='_2rslOn header-form-search']")).sendKeys("Watch");
	   // WebElement option=driver.findElement(By.xpath("//li[@class='AT0fUR']/div"));
	   // System.out.println("OPtions="+option.getSize());
	  // driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form")).sendKeys("Watch");
        driver.findElement(By.cssSelector("input[@title='Search for Products']")).sendKeys("Watch");
	}

}
