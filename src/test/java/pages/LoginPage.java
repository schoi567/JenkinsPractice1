package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver; 
	
	public LoginPage(WebDriver driver) {
		this.driver = driver; 
	}

 
	
	public void loginFunction(String Uname, String Pass) {
		WebElement LoginLink = driver.findElement(By.linkText("Log in")); 
		LoginLink.click(); 
		
		WebElement UserName = driver.findElement(By.name("user_login")); 
		UserName.sendKeys(Uname); 
		
		WebElement Password = driver.findElement(By.id("password")); 
		Password.sendKeys(Pass); 
		
		WebElement remember= driver.findElement(By.className("rememberMe"));
        remember.click();
		
		WebElement LoginBtn = driver.findElement(By.name("btn_login")); 
		LoginBtn.click(); 
		
	} 
	
	
	
	
}
