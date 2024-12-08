package TestNGTestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ref.TestBaseCode;

public class TestCase4Neg {
	//@BeforeTest
	//Launch the Browser
	@BeforeTest
	public void launchTheBrow()
	{
		TestBaseCode.driver();
	}
	
	//@BeforeMethod
	//Load the url
	//Validate the url is loaded
	@BeforeMethod
	public void loadTheUrl()
	{
		TestBaseCode.max();
		TestBaseCode.puturl("https://www.saucedemo.com/");
		TestBaseCode.checkurl();
	}
	//@Test
	//Pass the invalid credentials
	//validate the error massage is pop up
	@Test
	public void inValidCred()
	{
		TestBaseCode.passinvalidcred();
		TestBaseCode.errormsgthrow();
	}
	//@AfterMethod
	//Take screenShot
	@AfterMethod
	public void takScree()
	{
		try {
			TestBaseCode.takess("Error Msg Page");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//@AfterTest
	//Close the browser
	@AfterTest
	public void browclo()
	{
		TestBaseCode.close();
	}

}
