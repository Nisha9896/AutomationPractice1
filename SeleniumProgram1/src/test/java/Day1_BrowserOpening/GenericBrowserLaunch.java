package Day1_BrowserOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericBrowserLaunch {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    String Title=driver.getTitle();
    System.out.println("Title :"+Title);
    System.out.println("Title :"+Title.length());
    String appUrl=driver.getCurrentUrl();
    System.out.println("CurrentUrl :"+appUrl);
    System.out.println("CurrentUrl :"+appUrl.length());
    String PageSource=driver.getPageSource();
    System.out.println("Page Source length :"+PageSource.length());
    driver.quit();



	}

}
