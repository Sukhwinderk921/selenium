package Day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_Demo {

	public static void main(String[] args, int i) {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");

	//Approach 1
		
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//*[@id=\'datepicker\']")).sendKeys("15/03/2023");)
		
		//Approach 1
driver.findElement(By.xpath("//*[@id=\'datepicker\']")).click();
//String year="2026";
//String month="August";
//String date="20";

String year="2022";
String month="August";
String date="20";

//selecting month and year fopr future
while(true)
{
	String yr= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
	String mon= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
	
	if(year.equals(yr) && month.equals(mon))
	{
		break;	
	}
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
	}


// for previous 
//String year= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
//String month= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
//
//if(year.equals(yr) && month.equals(mon))
////	{
////		break;	
////	}
////	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
////	}


// selecting date 

List <WebElement> alldates= driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td"));
//for (WebElement dates:alldates)
//{
//	if (dates.getText().equals(date))
//	{
//		dates.click();
//		break;
//	}
//}

//selecting date with for loop
for(i=0; i<alldates.size(); i++)
{
	if (alldates.get(i).getText().equals(date))
	{
		alldates.get(i).click();
		break;	
	}
}

	}

}
