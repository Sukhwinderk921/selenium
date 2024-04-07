package TestNG_Day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	//@BeforeMethod
	//@BeforeClass
	//@BeforeTest
	@BeforeSuite
	public void login()
	{
		System.out.println("this is login method");
	}
	
	@Test(priority=1)
	public void Search()
	{
		System.out.println("Search Functionality");
	}
	
	@Test
	public void AdvancedSearch()
	{
		System.out.println("Advanced Search Functionality");
	}
	
	//@AfterMethod
	//@AfterClass
	//@AfterTest
	@AfterSuite
	public void logout()
	{
		//System.out.println("This is after test...");
		System.out.println("This is after suite...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
	}
}
