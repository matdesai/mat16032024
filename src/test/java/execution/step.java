package execution;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.driverfactory;
import pages.pompage;

public class step {
	pompage ps= new pompage(driverfactory.getDriver());
	WebDriver driver;
	@Given("user is at home page")
	public void user_is_at_home_page() {
	
		driver=driverfactory.getDriver();
		driver.get("https://www.snapdeal.com/");
	}

	@Then("user should see logo")
	public void user_should_see_logo() {
		  boolean verifylogos = ps.checklogo(); 
			
			
			assertTrue(verifylogos);
		

}
}