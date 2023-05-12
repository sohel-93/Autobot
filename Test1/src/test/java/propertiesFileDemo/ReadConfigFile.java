package propertiesFileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	Properties properties;
	String path ="C:\\Users\\shoel\\Automation\\Test1\\src\\test\\java\\propertiesFileDemo\\config.properties";
	
	public ReadConfigFile() throws IOException
	{
		properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
	}
	public String getUrl()
	{
		String url =properties.getProperty("url");
		if(url!=null)
			return url;
		else
			throw new RuntimeException("url not specified in config file");
	}
	
	public String getUserName()
	{
		String username =properties.getProperty("username");
		if(username!=null)
			return username;
		else
			throw new RuntimeException("username not specified in config file");
	}
	
	public String getPassword()
	{
		String password =properties.getProperty("password");
		if(password!=null)
			return password;
		else
			throw new RuntimeException("password not specified in config file");
	}
}
