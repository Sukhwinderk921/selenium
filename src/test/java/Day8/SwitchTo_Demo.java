package Day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchTo_Demo {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@click='jsConfirm()']")).click();
		
	//alert-- special class for handling the popups/alert window	
		
		mywait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert= driver.switchTo().alert();  //driver mode to pop up
		
		//accept()-- click ok
		//dismiss()--
		
		alert.accept();
		
		String text= driver.findElement(By.id("result")).getText();
		
		if(text.equals("You clicked Ok"))
			System.out.println("Test passed");
		else
			System.out.println("Test failed");
		
//		alert.dismiss();
//		String text= driver.findElement(By.id("result")).getText();
//		
//		if(text.equals("You clicked Ok"))
//		System.out.println("Test passed");
//	else
//		System.out.println("Test failed");
//		
	}

}
