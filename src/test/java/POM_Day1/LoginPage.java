package POM_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPage {
	WebDriver driver;  //global variable
	
//constructor
	LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
//loctae the element
	By logo= By.cssSelector("img[alt='company-branding']");
	By user_name= By.name("username");
	By pass_word= By.name("password");
	By clickbutton= By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
//actions
	
	public void setUserName(String username) 
	{
	driver.findElement(user_name).sendKeys(username);  //locating elements in POM
	}
	
	public void setPasswordName(String password) 
	{
	driver.findElement(pass_word).sendKeys(password) ;
	
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
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
