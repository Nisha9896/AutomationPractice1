package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtil;

public class eRail_Assignment extends SeleniumUtil {

	public static void main(String[] args) {
		eRail_Assignment ref=new eRail_Assignment();
		ref.HandleWindow();
	}
	void HandleWindow(){
		WebDriver driver=setUp("Chrome","https://erail.in/");
		String HomeWinID=driver.getWindowHandle();
	   
		
		ClickOnElement(driver.findElement(By.linkText("eCatering")));
		Set<String> AllWinId=driver.getWindowHandles();
		AllWinId.remove(HomeWinID);
		Iterator<String> itr = AllWinId.iterator();
		String ChildWnID=itr.next();
		driver.switchTo().window(ChildWnID);
		typeRequiredText(driver.findElement(By.xpath("//div[@class='flex flex-col']/div/div/input")),"1234");
	    ClickOnElement(driver.findElement(By.xpath("//*[@id=\\\"page-container\\\"]/div[1]/div[1]/div[1]/div/div[2]/div[1]/div/input")));

		//driver.switchTo().window(HomeWinID);
	     typeRequiredText(driver.findElement(By.id("txtStationFrom")),"Pune");
	    typeRequiredText(driver.findElement(By.id("txtStationTo")),"Mumbai Central");
	   // ClickOnElement(driver.findElement(By.xpath("//input[@value='09-Jan-25 Thu']")));
	    typeRequiredText(driver.findElement(By.xpath("//div[@class='divMainContainerArea']/div/div/table/tbody/tr[2]/td[4]/input")),"09-Jan-25 Thu");

		
	}

}
/**
open browser https://erail.in/
click on eCatering
enter train number as 12627 and select it from suggestion
select future date for boarding
select boarding station as itarsi
click on find food
get all restaurant names
come back to main page
From Pune
to Mumbai
date in future
print 
	train number
	train name
	Dept time
	Travel time
*/
