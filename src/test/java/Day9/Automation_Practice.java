package Day9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\'Wikipedia1_wikipedia-search-input\']")).sendKeys("selenium", Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\'Wikipedia1_wikipedia-search-form\']/div/span[2]/span[2]/input")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();
		
	    
	  Set <String> windowids= driver.getWindowHandles();
	  
	  for (String winid:windowids)
	  {
		  String title=driver.switchTo().window(winid).getTitle();
		  if(title.equals("Automation Testing Practice"))
		  {
			  Thread.sleep(4000);
		  }
		  else if(title.equals("Selenium Wikipedia"))
		  {
			  driver.findElement(By.xpath("//a[normalize-space()='Selenium]"));
		  }
		  System.out.println(driver.getTitle());
	  }
	  
	  for (String winid1:windowids)
	  {
		  String title=driver.switchTo().window(winid1).getTitle();
		  if(title.equals("Selenium in biology - Wikipedia"))
		  {
			  driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']"));
			  System.out.println(driver.getTitle());
			  Thread.sleep(4000);
		  }
	  }
		  
		  for (String winid2:windowids)
		  {
			  String title= driver.switchTo().window(winid2).getTitle();
			  if (title.equals("Selenium (software)- Wikipedia"))
			  {
			  driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)]"));
		  }
		  }
		  
		  for (String winid3:windowids)
		  {
			  String title= driver.switchTo().window(winid3).getTitle();
			  if (title.equals("Selenium disulfide - Wikipedia"))
			  {
			  driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']"));
		  }
		  }
		  
		  for (String winid4:windowids)
		  {
			  String title= driver.switchTo().window(winid4).getTitle();
			  if (title.equals("Selenium dioxide - Wikipedia"))
			  {
			  driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']"));
		  }
		  }
		  
		//String parentwindowid =arr.get(0);
		//String childwindowid1= arr.get(1);
//		String childwindowid1= arr.get(1);
//		String childwindowid2= arr.get(2);
//		String childwindowid3= arr.get(3);
//		String childwindowid4= arr.get(4);
		
		//driver.switchTo().window(childwindowid1);  //switching betwen the windows
		//driver.findElement(By.xpath("//*[@id=\'mw-content-text\']/div[1]/p[2]")).click();
		//System.out.println(driver.getTitle());
//		driver.switchTo().window(childwindowid1);
//		driver.switchTo().window(childwindowid2);
//		driver.switchTo().window(childwindowid3);
//		driver.switchTo().window(childwindowid4);
		
		//driver.switchTo().window(parentwindowid);
				
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]")).click();
		
		//String UrlToClick=driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a")).getAttribute("href");
			
		//driver.close();

	}
	
}
