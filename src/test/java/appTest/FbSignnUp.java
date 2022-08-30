package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignnUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 
		
	 
		
		WebElement SignUp = driver.findElement(By.xpath("//a[text()='Create new account']"));
        SignUp.click();
        
        WebElement Day = driver.findElement(By.id("day"));
        Select ddDay = new Select(Day);
        ddDay.selectByVisibleText("15");

        List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option")); 

        for (WebElement month: Months) {
        	System.out.println(month.getText()); 
        	
        } 
        
        
        
        
        
        WebElement Gender = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
        Gender.click(); 
        
        
        
        String GenVal = "Female";
        
        WebElement DynamicGen = driver.findElement(By.xpath("//label[text()='" + GenVal + "']/following-sibling::input"));
        DynamicGen.click();
 

		
		
		
		

	}

	
	
	
	/*
	
	 2) Relative Xpath
    //tagname
    //tag[@attr='value']
    //tag[@attr='value']/childTag
    //*[text()='Facebook helps you connect and share with the people in your life.']
    //h2
    //*[contains(text(),'connect and share')]
    //*[starts-with(text(),'Facebook helps')]
    //div[contains(@id,'Footer')]
    //a[@class='logo']/img
    //a[@class='logo']/parent::*
    //a[@class='logo']/following-sibling::nav[1]
    //a[@class='logo']/following::div[1]
    //a[@class='logo']/preceding::div
    //a[@class='logo']
//input[@type='radio' and @value='1']


*/ 
	
}





