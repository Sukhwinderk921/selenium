package TestNG_Day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	@Test
	void test()
	{
//		int x=10;
//		int y=10;
//		
//		if(x==y)
//			System.out.println("Test Passed");
//		else
//			System.out.println("Test failed");
				
		//Assert.assertEquals(x, y);  //hard assertions
		//Assert.assertEquals(true);  //passed
		//Assert.assertEquals(false);  //failed
		
		
//		Assert.assertTrue(true);  //pass
//		Assert.assertTrue(false); //fail 
//		
//		int a=30;
//		int b=20;
		
	//Assert.assertEquals(actual, expected, description);
		//Assert.assertEquals(a>b, true, "a is not smaller than b");
		
		
		String a1= "abc";
		String b1= "abc";
		
		Assert.assertEquals(a1, b1, "Both values are equal");
		
		if(true)
			Assert.assertTrue(true);
		else
			//Assert.assertFalse(false);
			Assert.fail();
	
		
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
