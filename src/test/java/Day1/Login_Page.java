package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty(null, null);
//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64")
	
	//WebDriverManager.chromedriver().setup();
	
		ChromeDriver driver= new ChromeDriver();

driver.get("https://demo.guru99.com/test/newtours/index.php");  //pass the url

driver.findElement(By.name("userName")).sendKeys("mercury");
driver.findElement(By.name("password")).sendKeys("mercury");
driver.findElement(By.name("submit")).click();	

//String title= driver.getTitle();

String act_value= driver.getTitle();

String exp_value="Login: Mercury Tours";

if(act_value.equals(exp_value))
{
	System.out.println("the test is passed");
}
else
	{
		System.out.println("the test is failed");
	}
}

//driver.close();  //to close the browser

	
	

	}


