package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pompage {

	WebDriver driver;
	@FindBy(xpath = "(//img[@title='Snapdeal'])[1]") private WebElement logo;
	
	
	public pompage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean checklogo() {
		
		
		boolean verify = logo.isDisplayed();
		
		return verify;
		
	}
}
