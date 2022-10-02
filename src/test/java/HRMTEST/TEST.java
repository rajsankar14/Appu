package HRMTEST;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\karup\\neweclipse\\Hotel_booking_P001\\Feature3\\outline.feature",
		glue="C:\\Users\\karup\\neweclipse\\Hotel_booking_P001\\src\\test\\java\\HRM\\HRMoutlinestep.java"

		)

public class TEST {

}
