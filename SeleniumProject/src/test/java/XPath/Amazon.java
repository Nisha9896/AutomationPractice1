package XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen
		driver.manage().window().maximize();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc");
	    //anniversary
      driver.findElement(By.xpath("//input[@aria-labelledby='Anniversary']//following-sibling::i")).click();
       
        //bhai-dhooj
        driver.findElement(By.xpath("//input[@aria-labelledby='Bhai Dooj']//following-sibling::i")).click();
	} 

}
