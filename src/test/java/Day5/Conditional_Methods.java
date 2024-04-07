package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isEnabled()
//IsDisabled()

public class Conditional_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2FLastName");
		
		WebElement Register= driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
		
		Boolean Display= Register.isDisplayed();
		System.out.println("The Register Text is available: " +Display);
		
		
//		WebElement TextBox1= Driver.findElement(By.cssSelector("#FirstName"));
//		
//		System.out.println(" The textbox is visible : " + TextBox1.isDisplayed());
		
		WebElement TextBox2= driver.findElement(By.cssSelector("#LastName"));
		System.out.println(" The textbox is visible : " + TextBox2.isDisplayed());
		
		WebElement Mradiobtn= driver.findElement(By.xpath("//input[@id='gender-male']"));
				

		
		
	}

}
