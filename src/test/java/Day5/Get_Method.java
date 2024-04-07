package Day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		System.out.println("The title of the page is:" + driver.getTitle());
//		
//		System.out.println("The current url of the page is:" + driver.getCurrentUrl());
//		
//		System.out.println(driver.getPageSource());
		
		String windowid= driver.getWindowHandle();
		
		System.out.println("The window id is: " + windowid);
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
	Set <String> windowids=driver.getWindowHandles();
	
	for(String winid:windowids)
	{
		System.out.println(winid);
	}
		driver.close();	
	}

}
