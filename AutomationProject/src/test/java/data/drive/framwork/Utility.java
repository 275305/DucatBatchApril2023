package data.drive.framwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Utility {
	
	
	public  static Object fetchPropertyValue(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream(".//Config//config.properties");
		
		Properties property=new Properties();
		  property.load(fis);
		  
		  return property.get(key);
		
	}
	
	
	public  static String fetchLocatorValue(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream(".//Config//Elements.properties");
		
		Properties property=new Properties();
		  property.load(fis);
		  
		  return property.get(key).toString();
		
	}

}
