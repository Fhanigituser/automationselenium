package art1130;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test160 {
	public static WebDriver driver;
	@Test
	public void openchrome()
	{
		System.setProperty("webdriver.chrome.driver", "D://Users//XY49043//OneDrive - Old Mutual//Desktop//Selenium//chromedriver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void enterdata()
	{
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys(Keys.ENTER,"hello world");		
	}

}
