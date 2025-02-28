package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StdDropDown {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demo.automationtesting.in/Register.html");
			
			WebElement dropdown=driver.findElement(By.id("Skills"));
			Select select=new Select(dropdown);
			System.out.println("Is dropdown allowed to select multiple option? "+select.isMultiple());
			System.out.println("Default value displayed in dropdown:"+select.getFirstSelectedOption());
			List<WebElement> optionList=select.getOptions();
			System.out.println("Size of List = "+optionList.size());
			for(WebElement element:optionList)
			{
				System.out.println(element.getText());
			}
			select.selectByIndex(1);
			System.out.println("Option selected from index1 : "+select.getFirstSelectedOption().getText());
			
		//	Thread.sleep(1000);
			select.selectByValue("Android");
			System.out.println("Option selected from value : "+select.getFirstSelectedOption().getText());
			//Thread.sleep(1000);
			select.selectByVisibleText("Backup Management");
			System.out.println("Option selected from visible text :"+select.getFirstSelectedOption().getText());
            
			
			}
	}


