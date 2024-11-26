package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static String getValue(String key) {
		
		Properties prop= new Properties();
		
		try {
			prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"/configuration/config.properties")));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Unable to Read Config file: "+e.getMessage());
		}
		
		String value=prop.getProperty(key);
		
		return value;

	}

}
