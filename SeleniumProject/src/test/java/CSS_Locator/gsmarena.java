package CSS_Locator;

import java.time.Duration;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.gsmarena.com/");
	
	
	List<WebElement> links=driver.findElements(By.cssSelector(".brandmenu-v2 >ul>li>a"));
	System.out.println("Total number of device = "+links.size());
	for(int i=0;i<links.size();i++) 
	{
		/*WebElement element=links.get(i);
		String deviceName=element.getText();
		System.out.println(deviceName);*/
	    System.out.println(links.get(i).getText());
			
	}
	driver.close();
	
	}
}
