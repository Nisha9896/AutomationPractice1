package multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_Suggestions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> SearchText=driver.findElements(By.cssSelector("div.OBMEnb>ul>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
		System.out.println("Total search text = "+SearchText.size());
		for(int i=0;i<SearchText.size();i++) {
		System.out.println(SearchText.get(i).getText()+":"+SearchText.get(i).getText().contains("selenium"));	
		}
		SearchText.get(2).click();
        String search2=driver.findElement(By.name("q")).getText();
        System.out.println("*****"+search2);
	}
	}


