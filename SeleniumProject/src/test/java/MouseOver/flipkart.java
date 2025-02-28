package MouseOver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("http://www.flipkart.com");
				//List<WebElement> menu = driver.findElement(By.className("._1ch8e_>div"));
				//for(int i=0;i<menu;i++) {
					
				}
				
		
		
		
	}


