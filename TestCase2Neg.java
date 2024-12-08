package TestNGTestCase;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ref.TestBaseCode;

public class TestCase2Neg extends TestBaseCode{
    //@BeforeTest
	//Launch the Browser
	
	@BeforeTest
	public void browlaun()
	{
		TestBaseCode.driver();
	}
	//@BeforeMethod
	//Load the URL
	//Valid the URL is loaded
	
	@BeforeMethod
	public void loadtheurl()
	{
		TestBaseCode.max();
		TestBaseCode.puturl("https://www.saucedemo.com/");
		TestBaseCode.checkurl();
		
		try {
			TestBaseCode.takess("URLloadCheck");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	//@Test
	//pass invalid credentials
	//valid whether the user is not login
	@Test
	public void passcred()
	{
		TestBaseCode.passinvalidcred();
		TestBaseCode.notloginInvalidcase();
		
	}
	//@AfterMethod
	//take screen shot
	@AfterMethod
	public void sc()
	{
		try {
			TestBaseCode.takess("Invalid login page");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//@AfterTest
	//close the browser
	@AfterTest
	public void teard()
	{
		TestBaseCode.close();
	}
	
}
