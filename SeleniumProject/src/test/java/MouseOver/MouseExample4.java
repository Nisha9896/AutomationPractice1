package MouseOver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// to open browser on full screen
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		WebElement src=driver.findElement(By.id("draggable"));
		action.dragAndDropBy(src, 150,100).build().perform();
	}

}
