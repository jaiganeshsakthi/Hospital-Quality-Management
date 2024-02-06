package GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility 
{
	public String getKeyValueFromProperty(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\HQM\\src\\test\\resources\\file\\commondata.properties");
		Properties pobj=new Properties();
		           pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}

}
