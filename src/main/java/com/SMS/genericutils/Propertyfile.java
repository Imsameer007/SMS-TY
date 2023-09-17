package com.SMS.genericutils;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfile {
public String fileUtility(String key) {
	FileInputStream f=new FileInputStream(IpathConstants.propertyFilePath);
Properties p=new Properties();
p.load(f);
}
}
