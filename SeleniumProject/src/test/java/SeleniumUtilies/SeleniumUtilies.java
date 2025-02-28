package SeleniumUtilies;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtilies {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
	public Properties prop;
	
	public WebDriver setUp(String browserType,String url) {		
		if(browserType.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(browserType.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		action=new Actions(driver);
		return driver;
	}
	
	public void typeRequiredInput(WebElement element, String value) {
		waitUntilElementPresent(element);
		element.clear();
		element.sendKeys(value);
	}
	
	public void clickOnElement(WebElement element) {
		waitUntilClickable(element);
		element.click();
	}
	
	public void waitUntilClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitUntilElementPresent(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String getAppTitle() {
		return driver.getTitle();
	}
	
	public String getAppTitle(String title) {
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public void loadPropertyFile(String fileLoaction) {
		try {
			FileInputStream fis=new FileInputStream(fileLoaction);
			prop=new Properties();
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getDataFromPropertyFile(String key) {
		return prop.getProperty(key);
	}
	
	public void performHover(WebElement element) {
		action.moveToElement(element).perform();
	}
	
	public void performCopyAndPaste(WebElement src,String value,WebElement target) {
		src.sendKeys(value,Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		target.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}
	
	public void performDragAndDrop(WebElement src, WebElement target) {
		action.dragAndDrop(src, target).build().perform();
	}
	
	/**
	 * TODO:
	 * 		getAttribute
	 * 		getCssValue
	 * 		getText
	 * 		Dropdown
	 */
}