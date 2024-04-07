package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class Dynamic_DropdownTask {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		 
		//driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
	
		// how to select one checkbox
		driver.findElement(By.id("monday")).click();
		List <WebElement> checkboxes = driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type='checkboxex']"));
		
		System.out.println("The no. of checkboxex are:" + checkboxes.size());
			
		for (int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}

	}

}
