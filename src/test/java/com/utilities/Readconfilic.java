package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfilic {
	
	Properties pro;
	
	public Readconfilic() {
	
	File src= new File ("./configuration/config.properties");
	
try 
	{
	
	   FileInputStream Fis=new FileInputStream(src);		
		pro=new Properties();
	    pro.load(Fis);
	
}
     catch (Exception e) {
	 System.out.println("Exception is" + e.getMessage());
	 		
}
}	
	public String getapplicationurl() {
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String getcity() {
		String city=pro.getProperty("selectcity");
		return city;
	}
	public String getname() {
		String username=pro.getProperty("entername");
		return username;
	}
	public String getage() {
	String Age=pro.getProperty("selectage");
	return Age;
	}
	public String getmobile() {
		String mobile=pro.getProperty("entermobilenumber");
		return mobile;
	}
	
	public String getchromepath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getfirefoxpath() {
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
}
	
}
	