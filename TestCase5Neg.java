package TestNGTestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ref.TestBaseCode;

public class TestCase5Neg {
	//@BeforTest
	//Launch the Browser
	@BeforeTest
	public void launch()
	{
		TestBaseCode.driver();
	}
	
	//@BeforeMethod
	//Load the url
	//Validate the url is loaded
	@BeforeMethod
	public void loadUrl()
	{
		TestBaseCode.max();
		TestBaseCode.puturl("https://www.saucedemo.com/");
		TestBaseCode.checkurl();
	}
	//@Test
	//pass invalid Cred
	//Validate the user is not logged o
	@Test
	public void passInvalidpwd()
	{
		TestBaseCode.usrNameCheck();
		TestBaseCode.visibilyOfUserNameCheck();
	}
	//@AfterMethod
	//TakeScreenShot
	@AfterMethod
	public void takescreenShot()
	{
		try {
			TestBaseCode.takess("Visible ,Enter the User Name");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//@AfterTest
	//Close the Browser
	@AfterTest
	public void close()
	{
		TestBaseCode.close();
		
	}

}
