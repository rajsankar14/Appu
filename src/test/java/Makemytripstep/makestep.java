package Makemytripstep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class makestep {
	public static WebDriver driver;
	@Given("To launch the makemytrip home page")
	public void to_launch_the_makemytrip_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/bus-tickets/");
		System.out.println("the home page is opened");
	}

	@When("I click login button")
	public void i_click_login_button() {
	}

	@When("I enter username")
	public void i_enter_username() {
	}

	@When("Iclick ok button")
	public void iclick_ok_button() {
	}

	@When("I enter password")
	public void i_enter_password() {
	}

	@When("I click enter button")
	public void i_click_enter_button() {
	}

	@Then("It should navigate to makemytrip home page")
	public void it_should_navigate_to_makemytrip_home_page() {
	}


}