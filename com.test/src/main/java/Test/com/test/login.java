package Test.com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class login {
	
	WebDriverHelper wh=new WebDriverHelper();
	



	//Constants
	public static Boolean expectedResult=null;
	

	
	//Xpaths
	static final By Signin= By.linkText("Sign in");
	static final By user_id_field= By.id("login_field");
	static final By password_field= By.id("password");
	static final By Submit=(By.xpath("//*[@type='submit']"));
	static final By Profile= (By.xpath("//a[@aria-label='View profile and more']/img"));
	static final By Logoutdropdown=(By.xpath("//a[@aria-label='View profile and more']/img"));
	static final By LogoutButton=By.xpath("//*[@class='dropdown-item dropdown-signout']");
	
	
	
	 public  void openURL(String URL) throws Exception {
		 wh.launchBrowser(URL);
	 }
	
	
	public  void login( String username,String Password) throws Exception{
		wh.waitForElementPresent(Signin);
		expectedResult = wh.isElementPresent(Signin);
        if (expectedResult) {
            wh.clickElement(Signin);
        }
        System.out.println("User name and password given : "+username+" , "+Password);
        wh.waitForElementPresent(user_id_field);
		expectedResult = wh.isElementPresent(user_id_field);
        if (expectedResult) {
            wh.sendKeys(user_id_field,username);
        }	
        
        
        wh.waitForElementPresent(password_field);
		expectedResult = wh.isElementPresent(password_field);
        if (expectedResult) {
            wh.sendKeys(password_field,Password);
        }	
        
        wh.waitForElementPresent(Submit);
		expectedResult = wh.isElementPresent(Submit);
        if (expectedResult) {
            wh.clickElement(Submit);
        }
        
        
       
	}


	public   void verifyLoginSuccess(String Username ) throws Exception {
		// TODO Auto-generated method stub
	
		wh.waitForElementPresent(Profile);
		
		
		expectedResult = wh.isElementPresent(Profile);
	
		
        if (expectedResult) {
        	
        	String uname_from_profile=wh.getAttribute(Profile,"alt");
        	uname_from_profile=uname_from_profile.replaceAll("@", "");
        //	System.out.println(Username+"actual"+uname_from_profile);
        	
        	if(Username.contains(uname_from_profile)){
        		
        		System.out.println("Log in success");
        		
        	}}
        	else{
        		System.out.println("Log in Failed");
        		Assert.fail(" Invalid username or Password ");
        		System.out.println("Invalid User ID Or password");
        	}
	}
}


	/*public void logout() {
		
		System.out.println("inside log out");
		WebElement mainMenu = w.findElement(By.xpath("//a[@aria-label='View profile and more']/img"));
		WebElement subMenu = driver.findElement(By.xpath("//*[@class='dropdown-item dropdown-signout']"));

		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath("//a[@aria-label='View profile and more']/img"));
		actions.moveToElement(mainMenu);
		System.out.println("clicked on main menu");
		WebElement subMenu = driver.findElement(By.xpath("//*[@class='dropdown-item dropdown-signout']"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();

		
		Actions action = new Actions(driver);
		 
        action.moveToElement(mainMenu).build().perform();
 
        System.out.println("main");
 
        action.moveToElement(subMenu).click().build().perform();
        	
		
	}}*/


	/*public   void loginFailed() throws Exception {
		// TODO Auto-generated method stub

		wh.waitForElementPresent(Signin);
		expectedResult = wh.isElementPresent(Signin);
        if (expectedResult) {
            wh.clickElement(Signin);
        }
        
        wh.waitForElementPresent(user_id_field);
		expectedResult = wh.isElementPresent(user_id_field);
        if (expectedResult) {
            wh.sendKeys(user_id_field,inavlid_username);
        }	
        
        
        wh.waitForElementPresent(password_field);
		expectedResult = wh.isElementPresent(password_field);
        if (expectedResult) {
            wh.sendKeys(password_field,inavlid_password);
        }	
        
        wh.waitForElementPresent(Submit);
		expectedResult = wh.isElementPresent(Submit);
        if (expectedResult) {
            wh.clickElement(Submit);
        }
        
        
	}*/

