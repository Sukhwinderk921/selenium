package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class Handling_checkboxes {

	public static void main(String[] args) {

		
		ChromeDriver driver= new ChromeDriver();
		 
		//driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
	
		// how to select one checkbox
		driver.findElement(By.id("monday")).click();
	
	//how to select multiple checkboxes	
		List <WebElement> checkboxes = driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type='checkboxex']"));
									
	System.out.println("The no. of checkboxex are:" + checkboxes.size());
		
	for (int i=0; i<checkboxes.size(); i++)
	{
		checkboxes.get(i).click();
	}
	
//	for(WebElement chk:checkboxes)
//	{
//		chk.click();
//	}
	
//how to select the last two elemnts 	
	for (int i=5; i<checkboxes.size(); i++)
	{
		checkboxes.get(i).click();
	}
	
//select first two checkboxes
	for (int i=0; i<2; i++)
	{
		checkboxes.get(i).click();
		}
	
 //unchecked/clear all checkboxes
	for (int i=0; i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}
	
//requirement is only to unselect if the checkbox is selected
	
	for(int i=0; i<checkboxes.size();i++)
	{
		if(checkboxes.get(i).isSelected())
		{
			checkboxes.get(i).click();
		}
	}
	
	
	}
}
