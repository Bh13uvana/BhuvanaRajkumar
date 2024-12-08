package TestNGTestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ref.TestBaseCode;

public class TextCase3Neg extends TestBaseCode {
	//@BeforeTest
	//Launch the browser
	@BeforeTest
	public void launchthebrowser()
	{
		TestBaseCode.driver();
	}
	
	//@BeforeMethod
	//Load the url
	//validate the url is load
	@BeforeMethod
	public void loadtheurl()
	{
		TestBaseCode.max();
		TestBaseCode.puturl("https://www.saucedemo.com/");
		TestBaseCode.checkurl();
	}
	
    //@Test
	//pass username
	//validate the user not loggedin
	@Test
	public void passusername()
	{
		TestBaseCode.errorcheck();
		TestBaseCode.errmsg();
	}
	
	//@AfterMethod
	//take screenshot
	@AfterMethod
	public void takesc()
	{
		try {
			TestBaseCode.takess("Invalid Login");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//@AfterTest
	//close the browser
	@AfterTest
	public void closethebrow()
	{
		TestBaseCode.close();
	}

}
