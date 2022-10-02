package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HRMoutlinestep {
	public static WebDriver driver ;

	public  void Browser_launch() {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\karup\\neweclipse\\Hotel_booking_P001\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		
		
	}
	@Given("^I launch the url \"([^\"]*)\"$")
	public void i_launch_the_url(String arg1) throws Throwable {
	}

	@When("^I provide \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_provide_and(String arg1, String arg2) throws Throwable {
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	}

	@Then("^I should see the login page$")
	public void i_should_see_the_login_page() throws Throwable {
	}


	
}