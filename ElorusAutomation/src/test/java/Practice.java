import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilities.ExcelFIleUtility;
import genericUtilities.PropertyFileUtility;
import objectRepo.CreateNewContact;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class Practice {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties pro=new Properties();
		pro.load(fis);
		
		//read data from property file
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PropertyFileUtility putil=new PropertyFileUtility();
		String URL = putil.readDataFromPropertyFile("URL");
		String USERNAME = putil.readDataFromPropertyFile("Username");
		String PASSWORD = putil.readDataFromPropertyFile("Password");
		//read data from excel file utility
		ExcelFIleUtility eutil= new ExcelFIleUtility();
		String FIRST_NAME = eutil.readDataFromExcelfile("CONTACTS", 1, 1);
		String LAST_NAME = eutil.readDataFromExcelfile("CONTACTS", 1, 2);
		String EMAIL_ID= eutil.readDataFromExcelfile("CONTACTS", 1, 3);
		
		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		/*driver.findElement(By.xpath("//input[@name='email']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//INPUT[@TYPE='submit']")).click();
		driver.findElement(By.xpath("//a[@title='Quick add']")).click();
		driver.findElement(By.xpath("//a[@href='/contacts/add/']")).click();*/
		HomePage hp= new HomePage(driver);
		hp.clickonnewcontactslink();
		CreateNewContact cnc= new CreateNewContact(driver);
		
		cnc.createNewContact(FIRST_NAME, LAST_NAME, EMAIL_ID);
		/*driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(FIRST_NAME);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(LAST_NAME);
		driver.findElement(By.xpath("//span[text()='Save']")).click();*/
		
		
		
	}

}
