Selenium Automation Mini Framewok
====================================

Readme Content
==============
1. Purpose
2. Tools 
3. Framework Structure
4. Example Codes and methods.


Purpose
=======
A Simple POM based framewok , which cab be extended to built a High end Farmework.
TestNG data providers is used to provide 2 sets of data.  @Test(priority=0,dataProvider = "validcredentials")
Prioirty is of TC is set by TestNG . @Test(priority=0,dataProvider = "validcredentials")

Tools 
========

1.	Selenium
2.	TestNG
3.   MAVEN 

### Framework Structure:
========================

The framework consists of the following components.

WebDriverHelper
* It has customised selenium functions 
* all the fucntions are built under Try and catch 


Login Page
* has xpath and functions related to Log in Page 

BasePage
* Is the main TestNG class

driver 
*This folder contain chrome browser driver


Example Codes
=================
login.openURL(URL)

 public void launchBrowser(String URL) throws Exception {
		 
		 driver.manage().deleteAllCookies();
		 
		 
		   
			try {								
		        driver.manage().window().maximize();   
		        driver.get(URL);									
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				
			}

	 }
	












 













