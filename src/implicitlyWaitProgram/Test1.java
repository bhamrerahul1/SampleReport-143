package implicitlyWaitProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
         driver.findElement(By.id("email")).sendKeys("rahulbhamre1137@gmail.com");
	
		driver.findElement(By.id("pass")).sendKeys("Rahul@456");
	
		driver.findElement(By.name("login")).click();
		
	   String pagetitle = driver.getTitle();
     	System.out.println( pagetitle);
     String url = driver.getCurrentUrl();
     System.out.println( url);
   if( pagetitle.equals("(15) Facebook"))
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
