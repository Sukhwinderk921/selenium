package Day18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_login {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=ARZ0qKJ_FFR8CNNwqtLae52UE7uZPFFRWieqZ7PSz_hUMtwHsmdLJDKK94966sq7QvyfjYCF3kWT&theme=mn&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("sukhwinder.kaur.151@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Sabina@1992*");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();	
		
		String act_value= driver.getTitle();

		String exp_value="Inbox (3,785) - sukhwinder.kaur.151@gmail.com - Gmail";

		if(act_value.equals(exp_value))
		{
			System.out.println("the test is passed");
		}
		else
			{
				System.out.println("the test is failed");
			}

	}

}
