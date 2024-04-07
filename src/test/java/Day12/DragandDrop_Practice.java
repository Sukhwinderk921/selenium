package Day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_Practice {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement bank= driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement account= driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		
		Actions act= new Actions(driver);		
		act.dragAndDrop(bank, account).build().perform();
		Thread.sleep(3000);
		
		WebElement rupees= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amount= driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		
		Actions act1= new Actions(driver);
		act1.dragAndDrop(rupees, amount).build().perform();		
		Thread.sleep(4000);
		
		WebElement sales= driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement acc= driver.findElement(By.xpath("//*[@id=\"loan\"]"));
		
		Actions actt= new Actions(driver);
		actt.dragAndDrop(sales, acc).build().perform();		
		//Thread.sleep(3000);
		
		WebElement rs= driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
		WebElement amtt= driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		
		Actions act4= new Actions(driver);		
		act4.dragAndDrop(rs, amtt).build().perform();
		
//		String textTo = amtt.getText();
//		if(textTo.equals("Dropped!")) {
//		System.out.println("PASS: File is dropped to target as expected");
//		}else {
//		System.out.println("FAIL: File couldn't be dropped to target as expected");
//		}
		
		
		

	}

}
