package loginScrpit;

import org.openqa.selenium.By;//naukri.com
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='btn btn-xs btn-outline-secondary mr-15']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("id_email_login")).sendKeys("rahulbhamre1137@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("id_password")).sendKeys("123456");
		Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@style='line-height: 17px;']")).click();
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
