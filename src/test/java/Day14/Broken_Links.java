package Day14;

import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();  //object of chrome class
	//WebDriver driver= new ChromeDriver();  //object of chrome class
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on web page : " +links.size());
		
		int brokenlink=0; //for storing the no.of broken link
		
		for(WebElement linkElement:links)
		{
			String hrefValue= linkElement.getAttribute("href");  //value of href attribute
			
			if(hrefValue==null || hrefValue.isEmpty())
			{
				System.out.println("href value id is empty");
				continue;
				
		//connection-- open, and send the connection
				URL linkurl= new URL(hrefValue);  //converting string to URL
				HttpURLConnection conn= (HttpURLConnection) linkurl.openConnection();  //sending request to URL
				conn.connect();
				
				if(conn.getResponseCode()>400)
				{
					System.out.println(hrefValue + " " + "Broken Link");
				}
				else
				{
					System.out.println(hrefValue + " "+ "Not broken link");
				}
				}
			
			System.out.println("Total No of Broekn links are :" );
				
			}
				
		}
	}

