package popUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopupCase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(3000);
		 Set<String> child = driver.getWindowHandles();
		driver.findElement(By.xpath("(//a[@href=\"https://assess.skillrary.com/essay\"])[2]")).click();
		Thread.sleep(3000);
	    
		     	for(String b:child)
		     	{
		     		driver.switchTo().window(b);
		     		
		     	}
		     	//System.out.println( parent);
		     	//System.out.println( child);*/
		     	
		     	
		     
		    	
		     	
		     	
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		

	}

}
