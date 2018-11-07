package javaselenium;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotTest {
	@BeforeSuite
	public void Bs()
	{
		Reporter.log("Before Suite Executed",true);
	}
	@BeforeTest
	public void Bt()
	{
		Reporter.log("Before Test Executed",true);
	}
	@BeforeClass
	public void Bc()
	{
		Reporter.log("Before Class Executed",true);
	}
	@BeforeMethod
	public void Bm()
	{
		Reporter.log("Before Method Executed",true);
	}
	@Test
	public void Test1()
	{
		Reporter.log("Test1 Executed",true);
	}
	@AfterMethod
	public void Am()
	{
		Reporter.log("After Method Executed",true);
	}
	@AfterClass
	public void Ac()
	{
		Reporter.log("After Class Executed",true);
	}
	@AfterTest
	public void At()
	{
		Reporter.log("After Test Executed",true);
	}
	@AfterSuite
	public void As()
	{
		Reporter.log("After Suite Executed",true);
	}
	@Test
	public void Test2()
	{
		Reporter.log("Test2 Executed",true);
	}
	
	
}

