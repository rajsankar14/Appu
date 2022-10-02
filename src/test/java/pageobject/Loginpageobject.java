package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpageobject { 
	
	
	
	/////===== method 1 with find element=====///////
//{
//	public   static   WebElement username(WebDriver driver) {
//		return driver.findElement(By.name("username"));
//	}
//	public static WebElement password(WebDriver driver) {
//		return driver.findElement(By.name("password"));
//	}
//	public static WebElement loginbutton(WebDriver driver	) {
//		return driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//	}
//}
	
	
	
	//////////=======method 2===///////////
	@FindBy(how= How.NAME,using="username") /////  model 1 
	public   static   WebElement username;
	
	@FindBy(name="password")    // model 2 
	public static WebElement password;
	
	@FindBy(xpath="//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")   // method 3 
	public static WebElement loginbutton;
}



