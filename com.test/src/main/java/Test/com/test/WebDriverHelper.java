package Test.com.test;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





	public class WebDriverHelper {

		
		public static WebDriver driver;
		
	

	public final Boolean expectedResult=false;
	 
	 public void launchBrowser(String URL) throws Exception {
		 
		 driver.manage().deleteAllCookies();
		 
		 
		   
			try {								
		        driver.manage().window().maximize();   
		        driver.get(URL);									
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				
			}

	 }
	



	public  void handleAlert() {
	
		try {			
			org.openqa.selenium.support.ui.WebDriverWait Wait = new org.openqa.selenium.support.ui.WebDriverWait(driver,2);
			Wait.until(ExpectedConditions.alertIsPresent());
			org.openqa.selenium.Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (Exception ex) {
			System.out.println("Execption occured during alert handle");
		}
	}



	public void waitForElementPresent(By elementBy) throws Exception {
		// TODO Auto-generated method stub
		
		isElementPresent(elementBy,5);

	}



	
		public boolean isElementPresent(By elementBy, int waitForSeconds)
				throws Exception {     
	    	
	    	boolean elementPresent = true;
	    	int count = 0;
	    	
	    	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	    	
	    	while(elementPresent){
	    		try{
	    			if (driver.findElement(elementBy).isDisplayed()){
	    				break;
	    			}else{
	    				if(count==waitForSeconds){
	        				elementPresent = false;
	            			break;
	            		}
	    				
	        			Thread.sleep(1000);
	        			count++;
	    			}
	    		}catch(Exception ex){
	    			if(count==waitForSeconds){
	    				elementPresent = false;
	        			break;
	        		}
	    			
	    			Thread.sleep(1000);
	    			count++;
	    		}
	    	}
	    	    	
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	return elementPresent;     
	    }
	
    public boolean isElementPresent(By elementBy) throws Exception {

	return isElementPresent(elementBy,5);
	
}



	public void clickElement(By elementBy) {
		// TODO Auto-generated method stub

			boolean exceptionOccured = false;

			try {
				if (isElementPresent(elementBy)) {

					driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

					try {

						try {

							driver.findElement(elementBy).click();


						} catch (NoSuchElementException nsee) {

							exceptionOccured = true;
						//	Log info code 

						}

					} catch (Exception ex) {

						exceptionOccured = true;
					//	log info code

					}

					

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}



	
		
		public void sendKeys(By elementBy, String typeValue) throws Exception {
			
			try {
				
				if(isElementPresent(elementBy, 1)) {
				
					driver.findElement(elementBy).clear();
					driver.findElement(elementBy).sendKeys(typeValue);
				}			
				
			} catch(Exception ex) {
				
				System.out.println(ex.getMessage());
			}
		}
		
	
		
		public String getAttribute(By elementBy, String attribute) throws Exception {

			String attributeValue = "";

			if (isElementPresent(elementBy)) {

				attributeValue = driver.findElement(elementBy).getAttribute(
				attribute);
			}

			return attributeValue;
}}



			


