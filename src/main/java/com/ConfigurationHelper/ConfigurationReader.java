package com.ConfigurationHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public Properties p;
	 public ConfigurationReader() throws IOException {
	 File f = new File("C:\\Users\\Hxtreme\\eclipse-workspace\\My_Project\\src\\My_Project\\AutomationAdactin\\src\\main\\java\\com\\ConfigurationHelper\\ConfigurationProperty.property"); 
	FileInputStream fis = new FileInputStream(f);
    p =new Properties();
	p.load(fis);
	
	 }
	
	public String url() {
	String p1 = p.getProperty("url");
	return p1;
    }
	
	public String username() {
	 String p2 = p.getProperty("username");
     return p2;
	}
	
	public String password() {
	String p3 = p.getProperty("password");
	return p3;
	}
	
	public String first_name() {
	String p4 = p.getProperty("first_name");
	return p4;
	}
	
	public String last_name() {
	String p5 = p.getProperty("last_name");
	return p5;
	}
	
	public String bill_address() {
	String p6 = p.getProperty("bill_address");
	return p6;
	}
	
	public String credit_card_no() {
	String p7 = p.getProperty("credit_card_no");
	return p7;
	}
	
	public String cvv_no() {
	String p8 = p.getProperty("cvv_no()");
	return p8;
	}
		
		
		
	
	
}