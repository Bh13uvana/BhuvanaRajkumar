package TestNGTestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ref.TestBaseCode;

public class TestCase7Possitive {
	//Launch the Browser
	@BeforeTest
	public void launchTheBrowser()
	{
		TestBaseCode.driver();
	}
	//Load the URL
	//Validate the URL is loaded
	@BeforeMethod
	public void lodeTheUrl()
	{
		TestBaseCode.max();
		TestBaseCode.puturl("https://www.saucedemo.com/");
		TestBaseCode.checkurl();
	}
	//Pass Valid cred
	//Validate the user is logged in
	@Test
	public void test()
	{
		TestBaseCode.passValidCred4();
		TestBaseCode.checkingOfAllUserName4();
	}
	//Take ScreenShot
	@AfterMethod
	public void takeScreenShot()
	{
		try {
			TestBaseCode.takess("Visible Alternate UserName3");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	//close the Browser
	@AfterTest
	public void closeTheBrowser()
	{
		TestBaseCode.close();
	}

}
