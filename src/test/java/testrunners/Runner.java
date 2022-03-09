package testrunners;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.Base2;

import Properties.Adactin_FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue= {"Stepdefinitions"}, dryRun=false,monochrome=false,
plugin="pretty")


public class Runner {
	
	public static WebDriver driver;
	
	
@BeforeClass
public static void browsername() throws IOException {
 String browser=Adactin_FileReaderManager.propfile().config().getbrowser();
driver= Base2.getBrowser(browser);
		
	
}
}