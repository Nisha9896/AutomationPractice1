package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtil;

public class RailsExample extends SeleniumUtil {

	public static void main(String[] args) {
		RailsExample ref=new RailsExample();
		ref.TestHandling();
			
	}
	void TestHandling()	{
	WebDriver driver= setUp("Edge","https://etrain.info/in");
    String homeWinId= driver.getWindowHandle();
    ClickOnElement(driver.findElement(By.cssSelector(".icon-twitter")));
    Set<String> allWinId=driver.getWindowHandles();
    allWinId.remove(homeWinId);
    Iterator<String> Itr=allWinId.iterator();
    String ChildWinID=Itr.next();
    driver.switchTo().window(ChildWinID);
    String title=getApplicationTitle("Log in to X / X"); 
    System.out.println("Application title="+title);
    driver.switchTo().window(homeWinId);
    System.out.println("Title="+getApplicationTitle());
    driver.quit();
	}

}
