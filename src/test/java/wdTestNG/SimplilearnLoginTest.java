package wdTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import junit.framework.Assert;
import pages.LoginPage;

public class SimplilearnLoginTest extends BaseClass{

	@Test
	public void NegativeTest() {
		LoginPage login = new LoginPage(driver); 
		login.loginFunction("abc@gmail.com", "awanmio!@#$234ASV" ); 
		
		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		String ActError = ErrorMsg.getText(); 
		String ExpError = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(ActError, ExpError); 
		
		 
	}
	
	@Test
	public void PositiveTest() {
		LoginPage login = new LoginPage(driver); 
		login.loginFunction("abc@gmail.com", "awanmio!@#$234ASV" ); 
		
	 
		
		 
	}
		
		
	} 
	
	
	
	
	
 








