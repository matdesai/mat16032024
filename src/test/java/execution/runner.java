package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features =  {"src\\test\\resources\\feture\\snap.feature"},
		glue = {"execution"},
		plugin = {"pretty"}
		
		
		
		
		
		
		
		)




public class runner  extends AbstractTestNGCucumberTests{

}
