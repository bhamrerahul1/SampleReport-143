package loginScrpit;

import org.openqa.selenium.By;//instagram
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		//Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("1234567");
	//	Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Rahul879999999@4#56");
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']")).click();
	//	Thread.sleep(3000);
	   String pagetitle = driver.getTitle();
     	System.out.println( pagetitle);
     String url = driver.getCurrentUrl();
     System.out.println( url);
  if( pagetitle.equals("Instagram"))
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
