package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReader {
	
	Properties p;
	
	public DataReader() throws IOException {
		
		String property = System.getProperty("user.dir");
		File f = new File(property+"\\src\\main\\java\\com\\property\\Constant.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	
	}
	
	public String getPropUrl() {

		String url = p.getProperty("url");
		return url;
		
		
	}

}
