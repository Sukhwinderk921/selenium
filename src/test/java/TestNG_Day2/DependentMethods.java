package TestNG_Day2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethods {
	
	@Test	(priority=1)
	void openurl()
	{
		//Assert.assertTrue(true);
		Assert.assertTrue(false);  //f it is failed
	}
	
	@Test(priority=2, dependsOnMethods= {"openurl"})
	void login()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=3)
	void search()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=4, dependsOnMethods= {"login", "search"})
	void AdvancedSearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=5, dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
