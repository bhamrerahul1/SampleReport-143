package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime {

	
	@FindBy(name="username")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	public Actitime(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void usertextbox(String name)
	{
		usernametb.sendKeys(name);
		}
	public void passwordextbox(String pwd)
	{
		passwordtb.sendKeys(pwd);
		}
	public void loginbutton()
	{
		loginbutton.click();
	
	
		}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	

	



