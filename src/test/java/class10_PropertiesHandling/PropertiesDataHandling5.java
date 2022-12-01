package class10_PropertiesHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDataHandling5 {
	


	private Properties properties;
	
	public   PropertiesDataHandling5() {
		//File configfilepath=new File("./src/test/resources/data/config.properties");
		String configfilepath=System.getProperty("user.dir")+"/src/test/resources/data/config.properties";
		try {
			FileInputStream input=new FileInputStream(configfilepath);
			properties=new Properties();
			properties.load(input);
					}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public String getvalue(String key) {
		return properties.getProperty(key);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
