package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\aman2\\eclipse-workspace\\SeleniumAutomation\\TestAutomation\\src\\test\\resources\\configfiles\\config.properties");
		//FileInputStream fis=new FileInputStream("C:\\Users\\aman2\\eclipse-workspace\\SeleniumAutomation\\TestAutomation\\src\\test\\resources\\configfiles\\config.properties");
		// TODO Auto-generated method stub
		Properties p=new  Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));

	}

}
