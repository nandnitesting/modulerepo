package com.KeywordFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OHRMProperties {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\\\Users\\\\M RAMA CHENNAREDDY\\\\Desktop\\\\10-30 Batch\\\\CoreJava\\\\Properties\\\\DataInput.Properties");

		FileInputStream fi=new FileInputStream(f);

		Properties p=new Properties();
		p.load(fi);
		System.out.println(p.getProperty("BaseURL"));
		System.out.println(p.getProperty("UserName"));
		System.out.println(p.getProperty("Password"));




	}

}
