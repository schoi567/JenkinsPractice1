package appTest;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class WebTableExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")); 
		System.out.println("Total number of rows are " + Rows.size());
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")); 
		System.out.println("Total number of columns are " + Columns.size());
		
		WebElement Data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println(Data.getText());		
		
		
		
		}
	
	/*
	1) tag#id_value 
	    
	    input#email
	2)  tag.class_value
	    input.email
	*/
	
	
	
	}












	
 







