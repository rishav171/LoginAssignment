Selenium Automation Mini Framewok
====================================
Pre_requiste 
==============
This is a maven project , you need maven insatlled to run this. Here is the link "http://maven.apache.org/install.html"

In order to run the project go to command promt
1-cd C:\Users\CD\workspace\com.test 
2-mvn -Dtest=baseclass test

Here in line 1 we go to the base project . This has to be your project location.
In line 2 we use maven plug in to run our test case. "baseclass" is our Testcase

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
3.     MAVEN 

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
	

### Future Improvements:
========================

Framework has re-usable codes which makes it easy to built a high end framework.
*Screesnshot feature will be added shortly.
*To handle large amount of data , Excel sheet will be used to handle Test Data.
* WebDriverHelper  class has limited customised backend implementation.The scope for this to advance is really required 








 













