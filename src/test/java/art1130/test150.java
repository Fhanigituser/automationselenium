package art1130;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test150 {
	public static WebDriver driver;
	
	@Test
	public void Applogin() throws InterruptedException
	{
		System.out.println("driver1"+driver);
		//System.setProperty("webdriver.chrome.driver", "D://Users//XY49043//OneDrive - Old Mutual//Desktop//Selenium//chromedriver//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
	}
	@Test
	public void validatelogin() throws InterruptedException
	{
	System.out.println("driver2"+driver);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
