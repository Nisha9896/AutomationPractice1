package KeyBoardMouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example6_jqueryui {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://jqueryui.com/draggable/");
	    driver.switchTo().frame(0);
	    Actions act =new Actions(driver);
	    
	    WebElement src=driver.findElement(By.id("draggable"));
	    act.dragAndDropBy(src, 100,50).build().perform();
	    
	}

}
