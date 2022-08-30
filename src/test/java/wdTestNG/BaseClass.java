package wdTestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class BaseClass {
	WebDriver driver; 
	
	@BeforeMethod 
	public void SetUp() {
		driver = new ChromeDriver(); 
		driver.get("https://www.simplilearn.com");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);	
		
	} 
	
	
	@AfterMethod 
	public void TearDown() {
		driver.close(); 
		
		
	} 
	 
		
		
	} 
	
	
	
	
	
 








