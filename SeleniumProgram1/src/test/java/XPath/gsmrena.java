package XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmrena {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get(" https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
		    WebElement mobilePrice= driver.findElement(By.xpath("//div[a[text()='SAMSUNG Galaxy F05 (Twilight Blue, 64 GB)']]/following::div[5]"));
		    System.out.println("mobile price="+mobilePrice.getText());
		    
	}

}
