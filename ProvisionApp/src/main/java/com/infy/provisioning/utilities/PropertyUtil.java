package com.infy.provisioning.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
	/** The prop. */
	private static Properties prop;
	static {
		prop = new Properties();
		
		
		try (InputStream input = new FileInputStream("src/main/resources/application.properties")) 
		
		{
			// load a properties file
			prop.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Gets the properties.
	 *
	 * @return the properties
	 */
	public static Properties getProperties() {
		return prop;
	}
}
