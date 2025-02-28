package BasicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpening {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
        driver.get("http://www.google.com");
        String actualAppTitle=driver.getTitle();
        String expectedAppTitle="Google";
        System.out.println("Title is : "+actualAppTitle+" |  number of Char in title "+actualAppTitle.length());
        System.out.println("is google search page opened"+actualAppTitle.equals(expectedAppTitle));
        String Currenturl=driver.getCurrentUrl();
        String expectedurl="www.google.com";
        System.out.println("is url matched with required url?"+Currenturl.equals(expectedurl));
        String PageSource=driver.getPageSource();
        System.out.println("number of char in pagesource "+PageSource.length());
        driver.close(); 
	}

}
