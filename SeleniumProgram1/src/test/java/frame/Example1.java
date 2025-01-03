package frame;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtil;

public class Example1 extends SeleniumUtil  {
   
	public static void main(String[] args) {
      
		
	Example1 ref=new Example1();
	ref.loginIntoActitimeWithoutIdentifyingElement();
}

public void loginIntoActitimeWithoutIdentifyingElement() {
	WebDriver driver=setUp("Chrome", "https://online.actitime.com/ubs/login.do");
	driver.switchTo().activeElement().sendKeys("admin01",Keys.TAB);
	driver.switchTo().activeElement().sendKeys("admin01",Keys.ENTER);
}

}
