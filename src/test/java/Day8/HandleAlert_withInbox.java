package Day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert_withInbox {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@click='jsPrompt()']")).click();
		
		Alert alert= driver.switchTo().alert();	
		
		alert.sendKeys("I am Popup Window");
		alert.accept();
		
	//validation
		
		//String text= driver.findElement(By.id("result")).getText();
		
//		if (text.equals("You entered: I am Popup Window" ))
//		{
//			System.out.println("Test passed");
//		}
//		else
//		{
//			System.out.println("Test failed");
//		}
		
		alert.dismiss();
		String text= driver.findElement(By.id("result")).getText();
		
		if(text.equals("You clicked Cancel"))
			System.out.println("Test passed");
		else
		{
			System.out.println("Test failed");
	
	
	
	}

}
}
