package multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  //userName
		  driver.get("https://demowebshop.tricentis.com/");
		  driver.findElement(By.cssSelector(".header-menu>ul>li>a")).click();
		List<WebElement> books =driver.findElements(By.cssSelector(".product-grid>div>div>*:nth-child(2)>h2>a"));
	   
		System.out.println("Total number of books = "+books.size());
		for(int i=0;i<books.size();i++) {
	    	System.out.println(books.get(i).getText());
	    }
	   }
}
	
	


