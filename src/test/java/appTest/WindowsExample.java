package appTest;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class WindowsExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 
		
		String ParentWin = driver.getWindowHandle(); 
		System.out.println("Before clicking tab button" + ParentWin);
		
		WebElement Tab = driver.findElement(By.id("tabButton")); 
		Tab.click(); 
		
		Set<String>handles = driver.getWindowHandles(); 
		 
        Iterator<String> itr = handles.iterator();
        while(itr.hasNext()) {
        	String currentHandel = itr.next();
        	System.out.println(currentHandel); 
        	if(!currentHandel.equals(ParentWin)) {
        		driver.switchTo().window(currentHandel); 		
        		
        	}
        }
        WebElement ChildWinElem = driver.findElement(By.tagName("h1"));
        System.out.println("Text on new window is " + ChildWinElem.getText()); 
        
        
        		
        	
        }
        
 
	}
 	
		
		
	
 
	
	












	
 







