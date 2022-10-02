package makemyrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="makemyfolder\\makemy.feature",
		glue="Makemytripstep\\makestep.java"

		)
public class makemyrun {

}
