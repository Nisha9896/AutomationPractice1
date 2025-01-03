package Day1_BrowserOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericBrowserLaunch2 {

	public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver(); 
    driver.get("https://demo.automationtesting.in/Register.html");
    String ActualTitle= "Register";
    String ExpectedTitle=driver.getTitle();
    System.out.println("is registration page opened? ="+ActualTitle.equals(ExpectedTitle));
    String ActualUrl="https://demo.automationtesting.in/Register.html";
    String ExpectedUrl=driver.getCurrentUrl();
    System.out.println("is registration URL entered correctly?="+ActualUrl.equals(ExpectedUrl));
	}

}
