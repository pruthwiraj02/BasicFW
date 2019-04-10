package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	WebDriver driver;
	
	
	public  void setup(String BrowserName)
	{
	if(BrowserName.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.firefox.marionette", ".\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.msn.com/en-in");
		driver.manage().window().maximize();
	}
	else if(BrowserName.equalsIgnoreCase("Chrome"))
	{

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.msn.com/en-in");
	    driver.manage().window().maximize();
	}
	}

	public  void closebrowser()
	{
		driver.close();
	}

}
