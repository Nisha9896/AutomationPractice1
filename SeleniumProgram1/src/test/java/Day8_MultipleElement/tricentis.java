package Day8_MultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tricentis {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.linkText("Motorcycle")).click();
		WebElement make=driver.findElement(By.cssSelector("#make"));
		Select mk=new Select(make);
		mk.selectByVisibleText("Honda");
		WebElement model=driver.findElement(By.cssSelector("#model"));
		Select md=new Select(model);
		md.selectByIndex(4);
		driver.findElement(By.cssSelector("#cylindercapacity")).sendKeys("150");
		driver.findElement(By.cssSelector("#engineperformance")).sendKeys("100");
		driver.findElement(By.cssSelector("#dateofmanufacture")).sendKeys("11/02/2023");
	WebElement nofs=driver.findElement(By.cssSelector("#numberofseatsmotorcycle"));
	Select seat=new Select(nofs);
	seat.selectByIndex(3);
	driver.findElement(By.cssSelector("#listprice")).sendKeys("10000");
	driver.findElement(By.cssSelector("#annualmileage")).sendKeys("1625");
	driver.findElement(By.cssSelector("#nextenterinsurantdata")).click();
	
	//page second
	driver.findElement(By.id("firstname")).sendKeys("Nisha");
	driver.findElement(By.id("lastname")).sendKeys("ABC");
	driver.findElement(By.id("birthdate")).sendKeys("09/15/1999");
	driver.findElement(By.cssSelector(".field>p>*:nth-child(2)>span")).click();
	driver.findElement(By.id("streetaddress")).sendKeys("Pune");

	WebElement Country=driver.findElement(By.id("country"));
	Select CountrySelect= new Select(Country);
	CountrySelect.selectByValue("India");
	driver.findElement(By.id("zipcode")).sendKeys("443404");
	driver.findElement(By.id("city")).sendKeys("Nandura");
	WebElement Occupation=driver.findElement(By.id("occupation"));
	Select OccupationSelect= new Select(Occupation);
	OccupationSelect.selectByIndex(1);
	driver.findElement(By.cssSelector(".field>p>*:nth-child(4)>span")).click();
	driver.findElement(By.cssSelector(".field>p>*:nth-child(5)>span")).click();
	driver.findElement(By.id("website")).sendKeys("CarDekho.com");
    driver.findElement(By.id("nextenterproductdata")).click();
    
    //page 3 
	driver.findElement(By.id("startdate")).sendKeys("01/24/2025");
	WebElement Insurance=driver.findElement(By.id("insurancesum"));
	Select InsuranceSelect=new Select(Insurance);
	InsuranceSelect.selectByIndex(3);
	
	WebElement damageinsurance=driver.findElement(By.id("damageinsurance"));
	Select damageinsuranceSelect=new Select(damageinsurance);
	damageinsuranceSelect.selectByValue("Partial Coverage");
    WebElement OptionalProduct=driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span"));
    OptionalProduct.click();
    driver.findElement(By.id("nextselectpriceoption")).click();

    driver.findElement(By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span")).click();

	
	
		

		

	}

}
