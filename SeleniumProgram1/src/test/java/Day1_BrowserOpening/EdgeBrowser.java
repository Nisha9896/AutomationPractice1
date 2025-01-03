package Day1_BrowserOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
   WebDriver driver=new EdgeDriver();
   driver.manage().window().maximize();
   driver.get("https://sampleapp.tricentis.com/101/app.php");
   
	}

}
