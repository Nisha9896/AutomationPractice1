package Day4.BrowserOps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/register");
		
		WebElement FirstName =driver.findElement(By.id("FirstName"));
		System.out.println("is firstname is displayed ?"+FirstName.isDisplayed());
		System.out.println("is firstname is editable ? "+FirstName.isEnabled());
		
		WebElement MaleRadio =driver.findElement(By.id("gender-male"));
		System.out.println("is maleRadioButton displayed?"+MaleRadio.isDisplayed());
		System.out.println("is maleRadioButton clickable?"+MaleRadio.isEnabled());
		System.out.println("is maleRadioButton selected before click?"+MaleRadio.isSelected());
		MaleRadio.click();
		System.out.println("is maleRadioButton Selected After Click"+MaleRadio.isSelected());
		
		WebElement RegisterOption =driver.findElement(By.id("register-button"));
		System.out.println("is RegistrationButton displayed?"+RegisterOption.isDisplayed());
		System.out.println("is RegistrationButton clickable?"+RegisterOption.isEnabled());
		System.out.println("RegistrationButton name :"+RegisterOption.getAttribute("value"));
		
		WebElement RegisterLink =driver.findElement(By.className("ico-register"));
		System.out.println("is Registrationlink displayed?"+RegisterLink.isDisplayed());
		System.out.println("is Registrationlink clickable?"+RegisterLink.isEnabled());
		System.out.println("Registrationlink name :"+RegisterLink.getText());

	}

}
