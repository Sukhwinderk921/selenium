package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Frames {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("hello frames");
	
	//Approach 1- locating frame by id/name
		driver.switchTo().frame("frm1"); //locating frame with id/name
		
	//Approach 2- locating frame using web element	
		driver.findElement(By.xpath("//*[@id='frm1']"));
		driver.switchTo().frame(Frame1);
		
		WebElement drp= driver.findElement(By.xpath("//select[@id='course']"));
		
		Select drpdown= new Select(drp);
		
		drpdown.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bye frames");
				
		
		driver.close();
	
	
	
	}

}
