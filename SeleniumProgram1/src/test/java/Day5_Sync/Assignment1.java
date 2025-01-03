package Day5_Sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://demo.automationtesting.in/Register.html");
	String ExpectedTitles="Register";
	String ActualTitles=driver.getTitle();
    System.out.println("Is Register Page Opened?  "+ActualTitles.equals(ExpectedTitles));	
	driver.findElement(By.linkText("WebTable")).click();
	//String ExpectedOption="WebTable";
	String ActualOption=driver.getTitle();
	System.out.println("Is WEbTable option opened ? "+ActualOption.contains("WebTable"));
	driver.navigate().back();
	
	}

}

/**
open browser
maximize window
enter url https://demo.automationtesting.in/Register.html
validate register page
click on WebTable
validate webtable page
come back to register page
validate register page
go to webtable page
validate webtable page
close browser
*/