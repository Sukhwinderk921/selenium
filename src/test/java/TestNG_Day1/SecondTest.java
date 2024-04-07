package TestNG_Day1;

import org.testng.annotations.Test;

public class SecondTest {
	@Test(priority=1)
	void login()
	{
		System.out.println("This is login");
	}
	@Test(priority=2)
	void search()
	{
		System.out.println("This is search");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("This is logout");
	}
	
}
