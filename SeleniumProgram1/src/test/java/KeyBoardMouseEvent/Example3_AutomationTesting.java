package KeyBoardMouseEvent;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_AutomationTesting {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://demo.automationtesting.in/Register.html");
		    List<WebElement> MenuList=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
		    
		    Actions act= new Actions(driver);
		    for(int i=0;i<MenuList.size();i++)
		    {
		    	act.moveToElement(MenuList.get(i)).perform();
		    	Thread.sleep(1000);
		    }
		    
	}

}
