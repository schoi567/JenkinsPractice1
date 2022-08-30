package appTest;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class AlertExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 
		WebElement elem = driver.findElement(By.xpath("//*[@id='alertButton']"));
        elem.click();
        Alert alert = driver.switchTo().alert(); 
        System.out.println(alert.getText()); 
        alert.accept(); 
        
 
	}
	
}
		
		
		
	
 
	
	












	
 







