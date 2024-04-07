package Day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Tables {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
	//find total no. of rows
		//int rows = driver.findElements(By.tagName("tr")).size();)
		//System.out.println("The total number of rows are " + rows);
		
		int rows= driver.findElements(By.xpath("//table[@name='Booktable']//tr")).size();
		System.out.println("The total number of rows are " + rows);
		
	//find total no. of columns	
		int cols= driver.findElements(By.xpath("//table[@name='Booktable']//th")).size();
		System.out.println("The total number of columns are " + cols);
		
	//read specific row and col	
		String print= driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		System.out.println(print);
		
	//read the data from all e rows and columns
		
		//System.out.println(Bookname + " " + Author + " " + Subject + " " + Price);
		for (int r=2; r<=rows; r++)
		{
			for (int c=1; c<=cols; c++)
			{
				//String value= driver.findElement(By.xpath("//table[@name='Booktable']//tr["+rows+"]//td["+cols"]")).gettext();
				System.out.println(print);
			}
			System.out.println();
			
			}
		
	// print book name whose author is amit
		for (int r=2; r<=rows; r++)
		{
			String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			{
				if(value.equals("Amit"))
				{
					String book= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
							System.out.println(book);
							
				}
			}
		}
		
	//get all the price
		int sum= 0;
		for(int r=2; r<=rows; r++)
		{
			String price= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]).getText();
					sum= sum+Integer.parseInt(price);  //type casting
		}
		
		System.out.println("Addition of all price of book is : " + sum);
		}
		
		}
		
		
		


