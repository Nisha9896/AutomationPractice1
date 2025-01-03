package Day6_ComponantValidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ActiTimeValidation2 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//to open browser on full screen use
		driver.manage().window().maximize();		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ubs/login.do");
		
		//username
		WebElement username=driver.findElement(By.id("username"));
		Point UsernameError= username.getLocation();
		int username_x=UsernameError.getX();
		int username_y=UsernameError.getY();
		System.out.println("username x_cords ="+username_x);
		System.out.println("username y_cords ="+username_y);
        //error message
		WebElement password=driver.findElement(By.className("errormsg"));
		Point passwordError=password.getLocation();
		int passwordError_x=passwordError.getX();
		int passwordError_y=passwordError.getY();
		System.out.println(" password x_cords ="+passwordError_x);
		System.out.println("password x_cords ="+passwordError_y);
		
		System.out.println("error message should above the username "+(username_y>passwordError_y));


		
	}

}
