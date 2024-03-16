package execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
//import net.bytebuddy.implementation.bytecode.Duplication;
import pages.driverfactory;



public class Hooks {
	driverfactory dr;
	WebDriver driver;
	
	@Before
	public void lounchBrowser() throws IOException  {
		
		
		Properties prop =new Properties();
		String str = System.getProperty("user.dir")+"\\src\\test\\resources\\feture\\prop.properties";
		FileInputStream fs= new FileInputStream(str);
		
		prop.load(fs);

		String broesernam = prop.getProperty("browser");
		
		 dr=new driverfactory();
		
		 driver = dr.initializebrowser(broesernam);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
		
	}

}
