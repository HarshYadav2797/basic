package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@title='Quick add']")
	private WebElement homeLookUpImg;
	
	@FindBy(xpath="//a[@href='/contacts/add/']")
	private WebElement contactsImg;
	
	
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public WebElement getHomeLookUpImg() {
		return homeLookUpImg;
	}



	public WebElement getContactsImg() {
		return contactsImg;
	}
	//business libraries
	public void clickonnewcontactslink()
	{
		homeLookUpImg.click();
		contactsImg.click();
	}

}
