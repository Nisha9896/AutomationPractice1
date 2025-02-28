package XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoBlaze {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen
		driver.manage().window().maximize();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		
		WebElement Price=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h5"));
		//WebElement price = driver.findElement(By.xpath("//div[h4[a[text()='Sony xperia z5']]]/h5"));
		System.out.println("Sony xperia z5="+Price.getText());
	}

}
