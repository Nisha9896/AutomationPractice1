package XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get(" https://www.demoblaze.com/");
    WebElement mobilePrice= driver.findElement(By.xpath("//div[h4[a[text()='Sony xperia z5']]]/h5"));
    System.out.println("mobile price="+mobilePrice.getText());
	}

}
