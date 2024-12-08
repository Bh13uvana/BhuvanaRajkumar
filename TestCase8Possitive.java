package TestNGTestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ref.TestBaseCode;

public class TestCase8Possitive {
	//Launch the browser
	@BeforeTest
	public void launchTheBrowser()
	{
		TestBaseCode.driver();
	}
	//Load the URL
	//validate the url is loaded
	@BeforeMethod
	public void loadTheUrl()
	{
		TestBaseCode.max();
		TestBaseCode.puturl("https://www.saucedemo.com/");
		TestBaseCode.checkurl();
	}
	//Pass valid credentials
	//validate whether the user is logged in
	@Test
	public void passCred()
	{
		TestBaseCode.passValidCred3();
		TestBaseCode.checkingOfAllUserName3();
	}
	//Take screenshot
	@AfterMethod
	public void takeScsh()
	{
		try {
			TestBaseCode.takess("Login Check");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//close the browser
	@AfterTest
	public void closeBrowser()
	{
		TestBaseCode.close();
	}

}
