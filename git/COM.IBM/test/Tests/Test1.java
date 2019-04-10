package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;

public class Test1   {

	TestBase tb;
	HomePage hp;
	WebDriver driver;

	@BeforeMethod
	public void startbrowser()
	{
		tb=new TestBase();
	    tb.setup("Chrome");
	}
	@Test
	public void validatetitle()
	{
		hp=new HomePage();
		hp.verifyHomePageTitle();


	}
	@AfterMethod
	public void close()
	{
		tb.closebrowser();
	}
}


