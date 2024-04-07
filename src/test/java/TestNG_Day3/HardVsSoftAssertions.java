package TestNG_Day3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	//@Test
	void HardAssertion()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		//Assert.assertTrue(true);  //passed
		Assert.assertTrue(false);  //false
		
		System.out.println("This is an example of hard assertion");
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test
	void SoftAssertion()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		SoftAssert sa= new SoftAssert();  //required step
		
		//sa.assertTrue(true);  //
		sa.assertTrue(false);  // failed, next execution will execute
		
		System.out.println("This is an example of soft assertion");
		
		sa.assertTrue(true);
		sa.assertTrue(true);
		
		sa.assertAll();  //required, all the methods are executing if one method is faled
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
