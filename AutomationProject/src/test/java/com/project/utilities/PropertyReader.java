package com.project.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	 Properties property;

	 public PropertyReader() {
		
		File file=new File(".//Config//config.properties");

		
	try {
		FileInputStream fis = new FileInputStream(file);
		

		property = new Properties();
		
		
			try {
				property.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	    
		
			
	 }
	 

	public String getApplicationURL() {
		String applicationURL = property.getProperty("suaceURL");
		
		return applicationURL;

	}
	public String username() {
		String username = property.getProperty("username");
		
		return username;

	}
	public String userPassword() {
		String userPassword = property.getProperty("userPassword");
		
		return userPassword;

	}

}
