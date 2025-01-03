package Day6_ComponantValidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWebShopValidation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://demowebshop.tricentis.com/login");
	    driver.findElement(By.className("login-button")).click();
	    
	    WebElement errorMsg=driver.findElement(By.className("message-error"));
        System.out.println("error Msg color ="+errorMsg.getCssValue("color"));
        System.out.println("error Msg font Size ="+errorMsg.getCssValue("font-family"));
        System.out.println("error Msg font family ="+errorMsg.getCssValue("font-family"));

	}

}
