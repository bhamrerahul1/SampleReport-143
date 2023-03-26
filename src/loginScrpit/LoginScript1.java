package loginScrpit;

import org.openqa.selenium.By;//facebook
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\wcsa3workspace\\selniumautomation\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
         driver.findElement(By.id("email")).sendKeys("rahulbhamre1137@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Rahul@456");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
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
