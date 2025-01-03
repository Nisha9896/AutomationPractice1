package Day6_ComponantValidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_ColorValidation {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("https://online.actitime.com/ubs/login.do");
		    driver.findElement(By.linkText("Login")).click();
		    WebElement errormsg=driver.findElement(By.className("errormsg"));
		    System.out.println("error msg font color"+errormsg.getCssValue("color"));
		    System.out.println("error msg font size "+errormsg.getCssValue("font-size"));
		    System.out.println("error msg font family "+errormsg.getCssValue("font-family"));

	}

}
