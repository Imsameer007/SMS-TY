package com.SMS.genericutils;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	/**
	 * This class consitst of methods to fetch common data from property file 
	 */
	public class FilleUtility {
		/**
		 * This method is used to fetch common data present inside the property file 
		 * @param Key
		 * @return
		 * @throws IOException 
		 * @throws  IOException
		 */
		public String getPropertyKeyValue(String key) throws IOException 
		{
			FileInputStream fileInoutStream = new FileInputStream(IPathConstants.propertyPath);
			Properties prop = new Properties();
			prop.load(fileInoutStream);
			return prop.getProperty(key);
		}

	}
}
