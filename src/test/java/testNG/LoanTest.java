package testNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoanTest {
	@Test(groups = {"sanity"})
	public void PersonalLoanTest1() {
		System.out.println("Inside PL1");
	}
	
}






