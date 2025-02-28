package MouseOver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample3 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://jqueryui.com/droppable/");
		    driver.switchTo().frame(0);
		        
		   Actions action = new Actions(driver);
		   WebElement src=driver.findElement(By.id("draggable"));
		   WebElement Target=driver.findElement(By.id("droppable"));
		   action.dragAndDrop(src, Target).build().perform();
	}

}
