package Day8_MultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.gsmarena.com/");
		List<WebElement> DeviceName=driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		for(int i=0;i<DeviceName.size();i++)
		{
			System.out.println("Device name = "+DeviceName.get(i).getText());
		}
	}

}/*
TC2: https://www.gsmarena.com/
Get the all device name present under phone finder */