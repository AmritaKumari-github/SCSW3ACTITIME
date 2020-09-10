package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
/**
 * reading the data from property file
 * @param key
 * @return String
 * @throws IOException 
 */
	public String getPropertyValue(String key) throws IOException {
		FileInputStream fis= new FileInputStream("./data/commondataProperty.txt");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
}
