package BasicProgram;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actiTimeProgram {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://online.actitime.com/qk/login.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("username")).sendKeys("admin01");
        driver.findElement(By.name("pwd")).sendKeys("admin01");
        driver.findElement(By.id("loginButton")).click();
        
        String currentTitle=driver.getTitle();
        //Wait.until(ExpectedCondition.titleIs(ExpectedTitle));
        String ExpectedTitle="actitime - Enter Time-Track";
        new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(20))
        .pollingEvery(Duration.ofSeconds(5))
        .ignoring(NoSuchElementException.class);
        
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
       
        
        System.out.println("is login successful?"+currentTitle.equals(ExpectedTitle));
        System.out.println("current Title is ?"+currentTitle);
       // wait.until(ExpectedCondition.elementToBeClickable(By.id("logoutlink")));
        driver.findElement(By.id("logoutLink")).click();
        // sdriver.close();
        
	}

}
