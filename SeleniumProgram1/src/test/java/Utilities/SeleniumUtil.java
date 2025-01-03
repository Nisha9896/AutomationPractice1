package Utilities;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {
    public static WebDriver driver;
    public static WebDriverWait wait;
   public static Actions actions;
    	
    public WebDriver setUp(String browsername,String appUrl) 
    {
    	if(browsername.equalsIgnoreCase("Chrome"))
    	{
    		driver=new ChromeDriver();
    	}else if(browsername.equalsIgnoreCase("Edge")) {
    		driver=new EdgeDriver();
    	}else if(browsername.equalsIgnoreCase("firefox")) {
    		driver=new FirefoxDriver();
    	}
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.get(appUrl);
    	
    	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
    	actions=new Actions(driver);
		return driver;
    }
    
	public void typeRequiredText(WebElement element,String Text) {
		waitUntilElementClickable(element);
        element.click();
        element.sendKeys(Text);
	}
	
	public void ClickOnElement(WebElement element) {
		waitUntilElementClickable(element);
		element.click();
	}
	
	public String getApplicationTitle()	{
		return driver.getTitle();
	}
	
	public String getApplicationTitle(String ExpectedTitle)	{
		wait.until(ExpectedConditions.titleContains(ExpectedTitle));
		return driver.getTitle();
	}
	public void waitUntilElementClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitUntilElementVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitUntilRequiredTextToBeDisplayed(WebElement element,String text) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	public void copyPaste(WebElement src, WebElement des) {
		actions.moveToElement(src).doubleClick().build().perform();
		src.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		des.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}
	
	public void dragAndDropElements(WebElement src, WebElement des) {
		actions.dragAndDrop(src, des).build().perform();
	}
	 }


