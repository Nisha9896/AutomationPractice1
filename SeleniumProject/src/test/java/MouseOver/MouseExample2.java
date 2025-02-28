package MouseOver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample2 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://demo.automationtesting.in/Register.html");
		    Actions action = new Actions(driver);
		    List<WebElement> mainMenuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		     for(int i=0;i<mainMenuList.size();i++)
		     {
		    	 action.moveToElement(mainMenuList.get(i)).perform();
		    	 Thread.sleep(1000);
		     }
		    
 		    
	}

}
