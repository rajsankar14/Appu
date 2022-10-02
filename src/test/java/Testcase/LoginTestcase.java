package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Loginpageobject;




public class LoginTestcase {
	public static WebDriver driver;	
	@Test
	public void Browser_launch() throws InterruptedException {
		//		System.setProperty("webdriver .chrome.driver ", 
		//				"C:\\Users\\karup\\neweclipse\\Hotel_booking_P001\\Driver\\chromedriver.exee");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		//////====== method 2 approach=====///////
		PageFactory.initElements(driver, Loginpageobject.class);
		
		Thread.sleep(6000);
		Loginpageobject.username.sendKeys("Admin");
		Thread.sleep(6000);
		Loginpageobject.password.sendKeys("admin123");
		Loginpageobject.loginbutton.click();
	
		
		////////======= method1  approach  =======/////////
		
//		Thread.sleep(3000);
//		Loginpageobject.username(driver).sendKeys("Admin");
//		Loginpageobject.password(driver).sendKeys("admin123");
//		Loginpageobject.loginbutton(driver).click();
		
		
}
	
	///======= Basic code  =========//////////
//	@Test
//	public void Login_user() throws InterruptedException {
//		Thread.sleep(4000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		Thread.sleep(4000);
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//	}

}
