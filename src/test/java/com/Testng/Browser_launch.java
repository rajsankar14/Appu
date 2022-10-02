package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Browser_launch {
	WebDriver driver ;
	@Test(priority=2)
	public void Google () {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karup\\neweclipse\\Hotel_booking_P001\\Driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("youtube ");
		//		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		//		driver.close();

	}
	//  @Ignore
	@Test(priority=1)
	public void edge () {

		// Set the driver path
		System.setProperty("webdriver.edge.driver", "C:\\Users\\karup\\neweclipse\\Hotel_booking_P001\\Edge\\msedgedriver.exe");

		// Start Edge Session
		WebDriver driver = new EdgeDriver();

		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("youtube ");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();

	}
	@Test(priority=3)
	public void email() {
		driver.navigate().to("https://accounts.google.com/");
		driver.navigate().refresh();

	}

	@Test(priority=4)
	public void  yahoo(){
		driver.navigate().to("https://login.yahoo.com/");
		driver.navigate().refresh();

	}

	@Test(priority=5)
	public void outlook() {
		driver.navigate().to("https://outlook.live.com/owa/");
		driver.navigate().refresh();

	}

	@Test(priority=6)
	public void  microsoft(){
		driver.navigate().to("https://www.microsoft.com/en-in");
		driver.navigate().refresh();




	}
}	  











