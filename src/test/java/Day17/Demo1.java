package Day17;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		
		  driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")).click();
		  
		  driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")).click();
		  
	
		  driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		
		//find table rows 
		 int rows= driver.findElements(By.xpath("/html/body/div[2]/table//tr")).size();
			System.out.println("The total number of rows are " + rows);
			
			for (int i=1; i<=rows; i++)
			{
				 min= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr["+(i+1)+"]/td[6]")).getText();
			}
			
			WebElement tablerowtext= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]"));
			
			WebElement lowest = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[6]"));
				
			String rowtext= tablerowtext.getText();
			System.out.println("The third row is " + rowtext );
			
			//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();

	}

}
