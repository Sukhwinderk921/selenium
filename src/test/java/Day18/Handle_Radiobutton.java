package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Radiobutton {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");	
		
		WebElement radio1 = driver.findElement(By.id("male"));
		WebElement radio2 = driver.findElement(By.id("female"));
		
	 //radio button 1 is selected	
		radio1.click();			
        //System.out.println("Male is Selected");	
        
     //radio button 1 is de-selected and radiobutton 2 is selected
        radio2.click();			
        System.out.println("Female is Selected");	
	}

}
