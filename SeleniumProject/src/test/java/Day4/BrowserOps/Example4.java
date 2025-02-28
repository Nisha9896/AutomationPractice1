package Day4.BrowserOps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement emailOpt=driver.findElement(By.className("email"));
		System.out.println("is email option Displayed ?"+emailOpt.isDisplayed());
		System.out.println("is email option editable ?"+emailOpt.isEnabled());
		
		WebElement passwordOpt=driver.findElement(By.id("Password"));
		System.out.println("is password option Displayed ?"+passwordOpt.isDisplayed());
		System.out.println("is password option editable ?"+passwordOpt.isEnabled());
		
		WebElement RememberMe=driver.findElement(By.id("RememberMe"));
		System.out.println("is RememberMe option Displayed ?"+RememberMe.isDisplayed());
		System.out.println("is RememberMe option editable ?"+RememberMe.isEnabled());
		System.out.println("is RememberMe option Selected ?"+RememberMe.isSelected());
		RememberMe.click();
		System.out.println("is RememberMe option Selected ?"+RememberMe.isSelected());

		
		WebElement loginButton=driver.findElement(By.className("login-button"));
		System.out.println("is Login option Displayed ?"+loginButton.isDisplayed());
		System.out.println("is login option clickable ?"+loginButton.isEnabled());



		
	}

}
