package popUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
     	 String parent = driver.getWindowHandle();
     	driver.findElement(By.xpath("(//a[@href='https://demoapp.skillrary.com'])[2]")).click();
     Set<String> child = driver.getWindowHandles();
           for(String b:child)
     	{
                driver.switchTo().window(b);
     		
     	}     	
        driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
         System.out.println( parent);
          System.out.println( child);
          
          
          
          
          
          
         
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
        
          
          
          
          
        
          
          
          
		
		}

}
