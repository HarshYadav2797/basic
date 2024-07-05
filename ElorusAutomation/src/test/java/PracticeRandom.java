import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeRandom {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://app.elorus.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("geetaydv1909@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("GeetaYadav1909");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Quick add']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@href='/contacts/add/']")).click();
		driver.findElement(By.xpath("//a[@href='/contacts/add/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='btn btn-default'])[1]")).click();
	}

}
