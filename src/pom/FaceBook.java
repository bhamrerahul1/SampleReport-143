package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook {
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	
	@FindBy(name="login")
	private WebElement loginbutton;
	
	public FaceBook(WebDriver driver)
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
