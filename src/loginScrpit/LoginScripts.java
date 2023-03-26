package loginScrpit;

import org.openqa.selenium.By;//actitime
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScripts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-2nsib7r/login.do");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
	   String pagetitle = driver.getTitle();
     	System.out.println( pagetitle);
     String url = driver.getCurrentUrl();
     System.out.println( url);
     if( pagetitle.equals("actiTIME - Enter Time-Track"))
     {
    	   	System.out.println("pass:home page is displayed");
    	 
     }
     else
     {
    		System.out.println("pass:home page is not  displayed");
    	 
     }
     driver.close();
   }

}
