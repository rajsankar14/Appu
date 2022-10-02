package Adacti_Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\karup\\neweclipse\\Hotel_booking_P001\\Feature3\\OrangeHRM.feature",
		glue="C:\\Users\\karup\\neweclipse\\Hotel_booking_P001\\src\\test\\java\\HRM\\HRM_STEOP.java")

public class HRM_testrunner {

}
