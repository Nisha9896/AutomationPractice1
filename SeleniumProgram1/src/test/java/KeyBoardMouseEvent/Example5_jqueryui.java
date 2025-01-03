package KeyBoardMouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example5_jqueryui {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://jqueryui.com/droppable/");
	    driver.switchTo().frame(0);
	    Actions act=new Actions(driver);
	    
	    WebElement src=driver.findElement(By.id("draggable"));
	    WebElement des=driver.findElement(By.id("droppable"));
        act.dragAndDrop(src, des).build().perform();
	}

}
