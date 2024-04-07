package TestNG_Day4;

import org.testng.annotations.Test;

public class InvocationCount_Demo {
	@Test(invocationCount=5)
	void test()
	{
		System.out.println("Testing...");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
