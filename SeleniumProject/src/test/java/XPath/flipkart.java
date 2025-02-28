package XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen
		driver.manage().window().maximize();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
        WebElement SamsungPrice=driver.findElement(By.xpath("//div[div[a[text()='SAMSUNG Galaxy A14 5G (Black, 128 GB)']]]/div/div/div"));	
		System.out.println("mobile price" + SamsungPrice.getText());
		
		driver.close();
	}

}
