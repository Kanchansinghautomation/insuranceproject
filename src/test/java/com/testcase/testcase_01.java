package com.testcase;

import java.                                                                                                                                                                                                                                                                io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pageobject.Loginpage;
public class  testcase_01 extends Baseclass {
	
	@Test
	
	public void logintest() throws IOException {
		
			
			driver.get(baseurl);
			
			logger.info("open the url");
			
			Loginpage hp=new Loginpage(driver);
			
			logger.info("enter city");
			
		    hp.SetcityName(selectcity);
						  
			logger.info("enter user name");
					
			hp.SetuserName(entername);
			
			logger.info("enter age");

			hp.SetAge(selectage);	
			
			logger.info("enter mobile numbers");

			hp.Setmobilenumber(entermobilenumber);
			
			logger.info("click on submit");

			hp.clicksubmitbutton();
			
			if  (driver.getTitle().equals("ComparePolicy"))
				
			{ 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			Assert.assertTrue(true);

			}
			
				else {
				captureScreen(driver, "kanchan");

				Assert.assertTrue(false);

				}
				
	
			}
		}
	 	
		
	
	
	
	


