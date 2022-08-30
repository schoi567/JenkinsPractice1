package appTest;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ScreemshptExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.simplilearn.com");
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 
		
		TakesScreenshot obj = (TakesScreenshot) driver; 
		
		File file = obj.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(file, new File("image.png")); 
		
		
		
		
	
	}

	/*
	//a[@class='login']
	//nav[@class='links-right']/a
	//input[@id='email']
	//*[text()='Facebook helps you connect and share with the people in your life.']
	//*[contains(text(),'connect and share')]
	//*[starts-with(text(),'Facebook helps')]
	//div[contains(@id,'Footer')]
	//a[@class='logo']/img
	//a[@class='logo']/parent::*
	//a[@class='logo']/following-sibling::nav[1]










	
	
	 */
	

}










