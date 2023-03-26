package loginScrpit;
import java.time.Duration;

import org.openqa.selenium.By;//naukri.com
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("login_Layer")).click();
	
		driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("Rahul@456");
	
	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
    	driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	   String pagetitle = driver.getTitle();
     	System.out.println( pagetitle);
     String url = driver.getCurrentUrl();
     System.out.println( url);
    if( pagetitle.equals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com"))
     {
    	   	System.out.println("pass:home page is displayed");
    	 
     }
     else
     {
    		System.out.println("pass:home page is not  displayed");
     driver.close();
    }

}
}

