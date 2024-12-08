package TestNGTestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ref.TestBaseCode;

public class TestCase6Neg {

	// Launch the browser
	
	@BeforeTest
	public void launchTheBrowser()
	{
		TestBaseCode.driver();
	}
	
	//Load the url
	//Validate the Url is loaded
	
	@BeforeMethod
	public void loadTheUrl()
	{
		TestBaseCode.max();
		TestBaseCode.puturl("https://www.saucedemo.com/");
		TestBaseCode.checkurl();
	}
	
	//pass valid credentials
	//Validate whether the user is logged in
	@Test
	public void test()
	{
		TestBaseCode.passValidCred2();
		TestBaseCode.checkingOfAllUserName2();
	}
	//Take screenShot
	@AfterMethod
	public void takeScreenShot()
	{
		try {
			TestBaseCode.takess("Visible Alternate UserName");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//close the browser
    @AfterTest
    public void quit()
    {
    	TestBaseCode.close();
    }
}
