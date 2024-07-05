package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Identification
	@FindBy(xpath="//input[@name='email']")
	private WebElement usernametxtFld;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtxtfld;
	
	@FindBy(xpath="//INPUT[@TYPE='submit']")
	private WebElement signinbtn;
	
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

   //utilization
	public WebElement getUsernametxtFld() {
		return usernametxtFld;
	}


	public WebElement getPasswordtxtfld() {
		return passwordtxtfld;
	}
	//business libraries
	/**
	 * this method will login to the application
	 * @param username
	 * @param Password
	 */
	public void loginToApp(String username, String Password)
	{
		usernametxtFld.sendKeys(username);
		passwordtxtfld.sendKeys(Password);
		signinbtn.click();
	}
	

}
