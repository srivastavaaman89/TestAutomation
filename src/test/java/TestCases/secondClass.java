package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.readxlsdata;
import base.Baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class secondClass extends Baseclass {
	@Test(dataProviderClass=readxlsdata.class,dataProvider="bvtdata")

	public static void login(String username, String password) throws InterruptedException
	{
    driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
    Thread.sleep(2000);
    driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
    Thread.sleep(2000);//locators-properties
    driver.findElement(By.id(loc.getProperty("next_button"))).click();
    Thread.sleep(2000);
    driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys(password);
    Thread.sleep(2000);
    driver.findElement(By.id(loc.getProperty("login_next_button"))).click();
	
	}
	
	//@DataProvider(name="testdata")
	public Object[] tData()
	{
		return new Object[][] {
			{"srivastavaaman89@gmail.com","Aman@9452"},
			{"srivastavaman89@gmail.com","Aman@9452"}
		
		};
	}

}


