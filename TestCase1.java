package TestNGTestCase;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ref.TestBaseCode;

public class TestCase1 extends TestBaseCode {
	//@Befor Test
	//Launch the Browser
	
	@BeforeTest
	public void browserlaunch()
	{
		TestBaseCode.driver();
	}
	//@Befor Method
	//Load the url
	//Valid the url is loaded
	
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
	//Pass valid credentials
	//Valid whether you have logged in
	@Test
	public void passcred()
	{
		TestBaseCode.passValidCred();
		TestBaseCode.checklogin();
	}
	//@After Method
	//Take ScreenShot
	@AfterMethod
	public void takescreenshot()
	{
		try {
			TestBaseCode.takess("LoginCheck");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//@After Test
	//Browser close
	@AfterTest
	public void tesrdown()
	{
		TestBaseCode.close();
	}

}
