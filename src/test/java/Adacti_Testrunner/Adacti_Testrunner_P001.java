package Adacti_Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Features",
		glue="com.Adactin_stepdefinition",monochrome=true,
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:report/adactin extent.html","pretty"
		}
		)

public class Adacti_Testrunner_P001 {

}
	