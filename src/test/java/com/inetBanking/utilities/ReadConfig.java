package com.inetBanking.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
 Properties prop;
 
 public ReadConfig() {
	 prop=new Properties();
	 try {
		FileInputStream fis=new FileInputStream("./Configuration/config.properties");
		prop.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Exception is"+e.getMessage());
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Exception is"+e.getMessage());
	}
 }
 public String getApplicationUrl(){
	String url=prop.getProperty("baseURL");
	return url;
 }
 
 public String getUsername(){
	 String username=prop.getProperty("username");
	 return username;
 }
 public String getPassword(){
	 String password=prop.getProperty("password");
	 return password;
 }
 public String getChromepath(){
	 String chromePath=prop.getProperty("chromepath");
	 return chromePath;
 }
 public String getIEpath(){
	 String iePath=prop.getProperty("iepath");
	 return iePath;
 }
 public String getFirefoxpath(){
	 String firefoxPath=prop.getProperty("firefoxpath");
	 return firefoxPath;
 }
}
