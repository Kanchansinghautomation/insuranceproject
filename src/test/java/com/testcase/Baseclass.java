package com.testcase;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.utilities.Readconfilic;

public class Baseclass {

	    Readconfilic Readconfilic=new Readconfilic() ;
		public String baseurl=Readconfilic.getapplicationurl();
		public String selectcity=Readconfilic.getcity();
		public String entername=Readconfilic.getname();
	    public String selectage=Readconfilic.getage();
		public String entermobilenumber=Readconfilic.getmobile();
			
		public static WebDriver driver;	
	    static Logger logger;
		 
        @Parameters("browser")
	    @BeforeClass
	 
	    public void setup(String br) {
    	 
        logger=Logger.getLogger("homeinsuranceproject");
     
	    PropertyConfigurator.configure("log4j.properties");
			 	 
	    if (br.equals("chrome")) {  
		 
	    System.setProperty("webdriver.chrome.driver",Readconfilic.getchromepath());
	 
	   driver=new ChromeDriver();
		
		}   
	 
      else if(br.equals ("firefox")) {
    	 
      System.setProperty("webdriver.gecko.driver",Readconfilic.getfirefoxpath());
    
   	  driver=new FirefoxDriver(); 
   	
      }

	   driver.get(baseurl);

      }	  
	  @AfterClass

      public void closed() {

	  driver.manage().window().maximize();
		 
	  driver.quit();

	  }
	
	  public void captureScreen(WebDriver driver, String tname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");

	}
	}