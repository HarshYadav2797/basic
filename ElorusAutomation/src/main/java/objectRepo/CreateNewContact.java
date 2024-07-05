package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContact {
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstnamTxtFld;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastnamTxtFld;
	
	@FindBy(xpath="(//a[@class='btn btn-default'])[1]")
	private WebElement addemailbtn;
	
	@FindBy(xpath="//input[@name='email0']")
	private WebElement emailtxtFld;
	
	@FindBy(xpath="//span[text()='Save']")
	private WebElement savbtn;
	
	//initialization
	public CreateNewContact(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    //utilization
	public WebElement getFirstnamTxtFld() {
		return firstnamTxtFld;
	}

	public WebElement getLastnamTxtFld() {
		return lastnamTxtFld;
	}
	
    public WebElement getSavbtn() {
		return savbtn;
	}
    
	public WebElement getAddemailbtn() {
		return addemailbtn;
	}
	
	public WebElement getEmailtxtFld() {
		return emailtxtFld;
	}
	//business libraries
	public void createNewContact(String FIRST_NAME , String LAST_NAME, String EMAIL_ID  )
	{
		firstnamTxtFld.sendKeys(FIRST_NAME);
		lastnamTxtFld.sendKeys(LAST_NAME);
		addemailbtn.click();
		emailtxtFld.sendKeys(EMAIL_ID);
		savbtn.click();
	}
}
