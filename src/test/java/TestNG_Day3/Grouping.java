package TestNG_Day3;

import org.testng.annotations.Test;

//loginByEmail - sanity & regression
//loginByfacebook - sanity
//loginBytwitter - sanity
//
//signupbyemail - sanity & regression
//signupbyfacebook - regression
//signupbytwitter - regression
//
//paymentinrupees - sanity & regression
//paymentindollar - sanity
//paymentReturnbyBank - regression

public class Grouping {

//loginByEmail	
	@Test(priority=1, groups= {"sanity", "regression"})
	void loginByEmail()
	{
		System.out.println("Method is loginByEmail");
	}
	
//loginByfacebook	
	@Test(priority=2, groups= {"sanity"})
	void loginByfacebook() 
	{
		System.out.println("Method is loginByfacebook");
	}
	
		
//loginBytwitter
	@Test(priority=3, groups= {"sanity"})
	void loginBytwitter() 
	{
		System.out.println("Method is loginBytwitter");
	}
	
//signupbyemail	
	@Test (groups= {"sanity", "regression"}, priority=4)
	void signupbyemail() 
	{
		System.out.println("Method is signupbyemail");
	}
	

//signupbyfacebook
	@Test(priority=5, groups= {"regression"})
	void signupbyfacebook() 
	{
		System.out.println("Method is signupbyemail");
	}
	
//signupbytwitter	
	@Test (groups= {"regression"}, priority=6)
	void signupbytwitter() 
	{
		System.out.println("Method is signupbytwitter");
	}

//paymentinrupees	
	@Test(groups= {"regression", "sanity"}, priority=7)
	void paymentinrupees() 
	{
		System.out.println("Method is paymentinrupees");
	}
	
	
//paymentindollar
	@Test(groups= {"sanity"}, priority=8)
	void paymentindollar() 
	{
		System.out.println("Method is paymentindollar");
	}
	

//paymentReturnbyBank	
	@Test(priority=9, groups= {"regression"})
	void paymentReturnbyBank() 
	{
		System.out.println("Method is paymentReturnbyBank");
	}
	
	
	
	
	
	

	

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
