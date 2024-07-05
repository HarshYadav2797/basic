package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	public String readDataFromPropertyFile(String key) throws IOException
	{
	FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
	Properties pr= new Properties();
	pr.load(fis);
	String value = pr.getProperty(key);
	return value;
	
	
	
	}

}
