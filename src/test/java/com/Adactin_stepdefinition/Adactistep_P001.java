package com.Adactin_stepdefinition;

import java.io.File;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactistep_P001 {
	
	
	public static WebDriver driver;

	@Given("^To launch the  browser$")
	public void to_launch_the_browser() throws Throwable {
//				System.setProperty("webdriver.chrome.driver",
//		"C:\\Users\\karup\\neweclipse\\Hotel_booking_P001\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		


	}

	@Given("^To launch Adactinhotel booking user  login page$")
	public void to_launch_Adactinhotel_booking_user_login_page() throws Throwable {
		driver.get("https://adactinhotelapp.com/index.php");

	}

	@When("^user enter the username$")
	public void user_enter_the_username() throws Throwable {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kumarsankar19996");

	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1995@");

	}

	@When("^To click the login option$")
	public void to_click_the_login_option() throws Throwable {
		driver.findElement(By.xpath("//input[@id='login']")).click();
   driver.navigate().to("https://adactinhotelapp.com/SearchHotel.php");
	}
	@Then("^naviagte the search hotel page$")
	public void naviagte_the_search_hotel_page() throws Throwable {
	    System.out.println("navigate the search hotl page ");
	    Thread.sleep(4000);
	}

	@Given("^user select the location of hotel$")
	public void user_select_the_location_of_hotel() throws Throwable {
		WebElement hotel_location = driver.findElement(By.id("location"));
		Select Ls = new Select(hotel_location);
		Ls.selectByIndex(1);
	}

	@Given("^user select the hotel name$")
	public void user_select_the_hotel_name() throws Throwable {
		WebElement hotel_name = driver.findElement(By.id("hotels"));
	Select Hn = new Select(hotel_name);
	Hn.selectByIndex(1);
	
	}

	@Given("^To select the roomtype$")
	public void to_select_the_roomtype() throws Throwable {
		
		WebElement room_type = driver.findElement(By.id("room_type"));
		Select Rt = new Select(room_type);
		Rt.selectByIndex(1);
	    
	}

	@Given("^To select the no of rooms$")
	public void to_select_the_no_of_rooms() throws Throwable {
		
		WebElement room_num = driver.findElement(By.id("room_nos"));
		Select Rn = new Select(room_num);
		Rn.selectByIndex(3);
	}

	@When("^user enter the check in date$")
	public void user_enter_the_check_in_date() throws Throwable {
		WebElement check_date = driver.findElement(By.id("datepick_in"));
		check_date.clear();
		check_date.sendKeys("10/08/2022");
	}

	@When("^user enter the check out date$")
	public void user_enter_the_check_out_date() throws Throwable {
		WebElement check_out_date = driver.findElement(By.id("datepick_out"));
		check_out_date.clear();
		check_out_date.sendKeys("17/08/2022");
	}

	@When("^To select the Adults per room$")
	public void to_select_the_Adults_per_room() throws Throwable {
		WebElement adult_per = driver.findElement(By.id("adult_room"));
		Select Adult = new Select(adult_per);
		Adult.selectByIndex(3);
		
	}

	@When("^To select the children per room$")
	public void to_select_the_children_per_room() throws Throwable {
		WebElement child_per = driver.findElement(By.id("child_room"));
		Select child = new Select(child_per);
		child.selectByIndex(3);
	}

	@When("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
		
		driver.findElement(By.id("Submit")).click();
		
	}

	@Given("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		driver.findElement(By.xpath("//input[@type='radio']")).click();
	}

	@When("^user click the continue button$")
	public void user_click_the_continue_button() throws Throwable {
		driver.findElement(By.id("continue")).click();
		
	}

	@Then("^It should naviagte the Book a hotel page dashboard$")
	public void it_should_naviagte_the_Book_a_hotel_page_dashboard() throws Throwable {
		System.out.println("it should navigate the booked hotel to user enter the  personal details ");
	}
	@Given("^user enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
		driver.findElement(By.id("first_name")).sendKeys("kumar");
	    
	}

	@Given("^User enter the lastname$")
	public void user_enter_the_lastname() throws Throwable {
		driver.findElement(By.id("last_name")).sendKeys("sankar");
	    
	}

	@Given("^user To enter the Billing address$")
	public void user_To_enter_the_Billing_address() throws Throwable {
		driver.findElement(By.id("address")).sendKeys("1/243 south street city tower");
	    
	}

	@Given("^To enter the credit card number$")
	public void to_enter_the_credit_card_number() throws Throwable {
	    driver.findElement(By.id("cc_num")).sendKeys("1234432112344321");
	}

	@Given("^To select the card type$")
	public void to_select_the_card_type() throws Throwable {
	    WebElement card_type = driver.findElement(By.id("cc_type"));
	    Select ctype= new Select(card_type);
	    ctype.selectByIndex(2);
	}

	@Given("^select the expiry month$")
	public void select_the_expiry_month() throws Throwable {
		WebElement card_month = driver.findElement(By.id("cc_exp_month"));
	    Select cmonth= new Select(card_month);
	    cmonth.selectByIndex(2);
	    
	}

	@Given("^select the expiry date$")
	public void select_the_expiry_date() throws Throwable {
		WebElement card_year = driver.findElement(By.id("cc_exp_year"));
	    Select cyear= new Select(card_year);
	    cyear.selectByValue("2022");
	    
	}

	@Given("^user enter the CVV nummber$")
	public void user_enter_the_CVV_nummber() throws Throwable {
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
	    
	}

	@Given("^click the booknow button$")
	public void click_the_booknow_button() throws Throwable {
		driver.findElement(By.id("book_now")).click();
	    
	}

	@Then("^It should navigate the booking confirmation page$")
	public void it_should_navigate_the_booking_confirmation_page() throws Throwable {
	    System.out.println("it should navigate the bokking confirmation pgae ");
	    Thread.sleep(7000);
	}
	
	@When("^user take screen shot$")
	public void user_take_screen_shot() throws Throwable {
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File source = ts .getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\karup\\neweclipse\\Hotel_booking_P001\\Screenshot\\Adactinbooking1.png");
		FileUtils.copyFile(source, destination);
		
	}

	@Then("^user close the driver$")
	public void user_close_the_driver() throws Throwable {
		System.out.println("Hotel booking is confirmed");
		Thread.sleep(7000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(6000);
		driver.close();
	}



}
