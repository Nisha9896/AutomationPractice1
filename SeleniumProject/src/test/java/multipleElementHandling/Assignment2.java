package multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		    WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.gsmarena.com/");
			
			
			driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();
			
List<WebElement> DeviceList=driver.findElements(By.cssSelector("#review-body>div>ul>li>a>strong>span"));
			System.out.println("Total number of Devices = "+DeviceList.size());
			for(int i=0;i<DeviceList.size();i++) {
			System.out.println(DeviceList.get(i).getText());
			
				}
	}

}
