package Day8_MultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.demoblaze.com/");
	    List<WebElement> DeviceName=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
	    System.out.println("Total Devices ="+DeviceName.size());
	    List<WebElement> DevicePrice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));

	    for(int i=0;i<DeviceName.size();i++)
	    {
	    	System.out.println("Device name "+DeviceName.get(i).getText()+": "+DevicePrice.get(i).getText());
	    }
	   
	    
	}

}

/*TC1:
Print all device name along with there price
https://www.demoblaze.com/  */