package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropdown=driver.findElement(By.id("Skills"));
		Select select=new Select(dropdown);
		//WebElement element=select.getFirstSelectedOption();
		//select.selectByIndex(1);
		select.selectByVisibleText("C");
		//System.out.println("first Option"+element.getText());
	}

}
