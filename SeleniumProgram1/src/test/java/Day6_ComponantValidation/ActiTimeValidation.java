package Day6_ComponantValidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidation {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://online.actitime.com/ubs/login.do");
    WebElement username = driver.findElement(By.id("username"));
    System.out.println("is username option visible? "+username.isDisplayed());
    System.out.println("is username option editable ? "+username.isEnabled());
   System.out.println("Default value of username ? "+username.getAttribute("placeholder"));

    //Checkbox Option Validation
    WebElement checkbox= driver.findElement(By.id("keepLoggedInCheckBox"));
    System.out.println("is checkbox option visible? "+checkbox.isDisplayed());
    System.out.println("is checkbox option editable ? "+checkbox.isEnabled());
    System.out.println("is checkbox option Selected ? "+checkbox.isSelected());
    checkbox.click();
    System.out.println("is checkbox option Selected ? "+checkbox.isSelected());

    
    //Button Validation
    WebElement Button=driver.findElement(By.id("loginButton"));
    System.out.println("is loginButton option visible? "+Button.isDisplayed());
    System.out.println("is loginButton option editable ? "+Button.isEnabled());
    System.out.println("is loginButton option editable ? "+Button.getText());

	}
}
/*
User name:
	visible
	editable
	default value
Check box:
	visible
	functional/clickable
	default selection
	after selection
Button:
	visible
	functional
	button name
*/