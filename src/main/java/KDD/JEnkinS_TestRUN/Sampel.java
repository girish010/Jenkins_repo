package KDD.JEnkinS_TestRUN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sampel 
{
WebDriver driver;
	@BeforeMethod
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://mykidsbank.org");
	}
	
	@Test
	public void gettitle()
	{
		System.out.println(driver.getTitle() + "           Test Success");
	}
	
}
