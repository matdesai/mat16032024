package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverfactory {
	
	static WebDriver driver;
	public WebDriver initializebrowser(String browsername) {
		
		
		if(browsername.contains("chrome")) {
			
			 driver= new ChromeDriver();
			
		}
		
		else if(browsername.contains(browsername)) {
			
			 driver = new FirefoxDriver();
			
		}
		
		else if(browsername.contains("edge")) {
			
			 driver= new EdgeDriver();
		}
		
		return driver;
	}

	
	
	public static  WebDriver getDriver() {
		
		return driver;
	}
}
