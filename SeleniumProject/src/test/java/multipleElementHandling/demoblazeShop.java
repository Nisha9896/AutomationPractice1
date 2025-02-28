package multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblazeShop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4"));
		List<WebElement> deviceListPrice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
        System.out.println("total number of Device"+deviceList.size());
		
        for(int i=0;i<deviceList.size();i++) {
        	System.out.println(deviceList.get(i).getText()+" :"+deviceListPrice.get(i).getText());
        	/*WebElement element = deviceList.get(i);
        	String name = element.getText();
        	System.out.println(name);
        	
        	WebElement Deviceprice= deviceListPrice.get(i);
        	String Price = Deviceprice.getText();
            System.out.println(Price);*/
            
            
        }
        
		/*for(int i=0;i<deviceList.size();i++)
		{
			WebElement element=deviceList.get(i);
			String name=element.getText();
			System.out.println(name);
			WebElement price=devicePriceList.get(i);
			System.out.println("device price ="+price);
			//System.out.println("device price="+devicePriceList);*/
		
		
		
	}	
	}


