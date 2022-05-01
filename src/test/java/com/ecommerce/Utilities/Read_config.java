package com.ecommerce.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_config {
	Properties pro;
	
	public Read_config() 
	{
		File src = new File("./Configuration/config.properties");
		
		{
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(src);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			pro = new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		}
		public String getApplicationURL()
		{
			String url=pro.getProperty("baseURL");
			return url;
		}
		public String getUserName()
		{
			String username=pro.getProperty("username");
			return username;
		}
		public String getPassword()
		{
			String password=pro.getProperty("password");
			return password;
		}
		public String getChromepath()
		{
			String Chromepath=pro.getProperty("chromepath");
			return Chromepath;
		}
		
}


	
	
	

