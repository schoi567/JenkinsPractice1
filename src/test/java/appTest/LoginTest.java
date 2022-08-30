package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.simplilearn.com");
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 
		
		Thread.sleep(5000); 
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in")); 
		LoginLink.click(); 
		
		WebElement UserName = driver.findElement(By.name("user_login")); 
		UserName.sendKeys("abc@gmail.com"); 
		
		WebElement Password = driver.findElement(By.id("password")); 
		Password.sendKeys("123456ascASD@#$"); 
		
		WebElement remember= driver.findElement(By.className("rememberMe"));
        remember.click();
		
		WebElement LoginBtn = driver.findElement(By.name("btn_login")); 
		LoginBtn.click(); 
		
		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		String ActError = ErrorMsg.getText(); 
		String ExpError = "The email or password you have entered is invalid.";
		
		if(ActError.equals(ExpError)) {
			System.out.println("TC is passed"); 			
		}else {
			System.out.println("TC is Faile"); }
	
		List<WebElement> Links = driver.findElements(By.tagName("a")); 
		System.out.println("Total number of links are " + Links.size());
	
		for(int index=0; index<Links.size(); index++)	{
			System.out.println(Links.get(index).getText());
			System.out.println(Links.get(index).getAttribute("href"));
		}
		

		driver.close(); 
	
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










