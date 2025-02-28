package multipleElementHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  //userName
		  driver.get("https://opensource-demo.orangehrmlive.com");		  
		  WebElement username=driver.findElement(By.cssSelector(".orangehrm-login-slot>div:nth-of-type(2)>div:nth-of-type(1)>*:first-child>p"));
		  String user=username.getText();
		  System.out.println(user);
		  String StrUser[]=user.split(" ",3);
		  for(int i=0;i<StrUser.length;i++) {
			 if(i==2) {
				 System.out.println(StrUser[i]);
				 driver.findElement(By.name("username")).sendKeys(StrUser[i]);
			 } }
				 //Password
				 
		WebElement password= driver.findElement(By.cssSelector(".orangehrm-login-error>div>*:nth-child(2)"));
		String pw=password.getText();
		System.out.println(pw);
		String strpw[] = pw.split(" ");
		 for(int j=0;j<pw.length();j++) {
			 if(j==2) {
				System.out.println(strpw[j]); 
				 driver.findElement(By.name("password")).sendKeys(strpw[j]);
				 
				 WebElement login= driver.findElement(By.className("orangehrm-login-button"));
				 login.click();
			 }
			 }
			 
		 }
			 } 
		  
		  
		  
	
