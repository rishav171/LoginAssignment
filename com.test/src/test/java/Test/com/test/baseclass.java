package Test.com.test;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class baseclass extends WebDriverHelper{

	
	login login;
	static  final String URL="https://github.com/";
	static final String driverpath="C:\\Users\\CD\\workspace\\com.test\\driver\\chromedriver.exe";
	
	
	public class DataProviderTest {
		 
		
		@DataProvider
		public Object[][] validcredentials()
		{
		
		return new Object[][] {{"rishav171", "qwerty1234"}}; 
			
		}
		@DataProvider
		public Object[][] invalidcredentials()
		{

			return new Object[][] {{"testuser", "qwerty1234"}}; 
		}
	  
	
	@BeforeTest
	 
	public void Chrome_setup() throws Exception {

		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
		login = new login();

		
	}

	
	@Test(priority=0,dataProvider = "validcredentials")
	
	 public void SuccessfullLogin(String Username,String Password) throws Exception {
		 
	  login.openURL(URL);
	  System.out.println("Test case name : Successfull Log in ");
	  login.login(Username,Password);
	  
	  login.verifyLoginSuccess(Username);  
 }
 
	@Test (priority=1,dataProvider = "invalidcredentials")
	
	public void Faliedlogin(String Username,String Password) throws Exception {
	
	  login.openURL(URL);
	  System.out.println("Test case name : Failed Log in ");
	  login.login(Username,Password);
	  login.verifyLoginSuccess(Username);
  }

  
  
	@AfterTest
	public void shutDownSelenium() {
		
	driver.close();
	    
	}
}}
