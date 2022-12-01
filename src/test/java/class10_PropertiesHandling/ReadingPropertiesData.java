package class10_PropertiesHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesData {

	public static void main(String[] args) throws IOException {

		
		File file=new File("./src/test/resources/data/config.properties");
		System.out.println(file.exists());//true
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String url=prop.getProperty("url");
		System.out.println(url);
		
		String username=prop.getProperty("username");
		System.out.println(username);
		
		String password=prop.getProperty("password");
		System.out.println(password);
		
		//If key is not present then it will return a null value
		String browserType=prop.getProperty("browserType");
		System.out.println(browserType);
		
	
		
		
	}
	
	

}
