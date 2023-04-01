package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {   // this class only for  read configuration file in that class 
	
	private String path ="C:\\Users\\ARUN\\eclipse-workspace\\30JulyCucumberFramework\\src\\test\\resources\\properties\\Config.properties";
	private Properties pro;
	
	
	ReadConfig()
	{
		File file = new File(path);
		try{
			FileInputStream fis = new FileInputStream(file);
			pro=new Properties();
			pro.load(fis);
		   } 
		catch (IOException e)
		  {
			System.out.println("Check the path of config file");
			e.printStackTrace();
		  }
		
	}
		
		public String getBrowserName()
		 {
			String browser_name = pro.getProperty("browser");
			return browser_name;
		 }
		
		public String getApplicationUrl()
		{
			String app_url = pro.getProperty("url");
			return app_url;
		}
		
}
