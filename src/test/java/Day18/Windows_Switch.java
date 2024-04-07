package Day18;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Switch {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set <String> windowids=driver.getWindowHandles();
		for(String winid:windowids)
				{
					String title= driver.switchTo().window(winid).getTitle();
					
					if(title.equals("Human Resource Management Software | OrangeHRM"))
						{
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*div[@class='d-flex web-menu-btn']//li[1)//a[1]")).click();	
						System.out.println(driver.getTitle());
						}
					
					else if(title.equals("OrangeHRM"))
					{
						driver.findElement(By.name("username")).sendKeys("admin");
						System.out.println(driver.getTitle());
					}

	}
		/*Set <String> windowids=driver.getWindowHandles();
		List<String> arr= new ArrayList(windowids); //set is converted into arraylist
		
		String parentwindowid =arr.get(0);
		String childwindowid= arr.get(1);
		
		driver.switchTo().window(childwindowid);  //switching betwen the windows
		//driver.findElement(By.xpath("//*div[@class='d-flex web-menu-btn']//li[1)//a[1]")).click();
		
		//System.out.println(driver.getTitle());
		
		//driver.switchTo().window(parentwindowid);
		//driver.findElement(By.name("username")).sendKeys("admin");*/

}
}
