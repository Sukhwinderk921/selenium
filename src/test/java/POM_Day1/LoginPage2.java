package POM_Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	
//creating POM class
	WebDriver driver;  //global variable
	
	//constructor
		LoginPage2(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(css="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-branding")
			WebElement logo;
		
		@FindBy(name="username")
		WebElement user_name;
		
		
//pagefactory		
//		@FindBy(how=How.NAME, using="username")
//		WebElement user_name;
		
		@FindBy(name="password")
		WebElement pass_word;
		
		
		
		
		public void setUserName(String username) 
		{
		user_name.sendKeys(username);  //locating elements in POM
		}
		
		public void setPasswordName(String password) 
		{
		pass_word.sendKeys(password) ;
		
		}
		
		public void clicksubmit()
		{
			driver.findElement(clickbutton).click();
		}
		
		public Boolean checkLogo()
		{
			Boolean status= driver.findElement(logo).isDisplayed();
			return status;
		}
		
	
	
	
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
