package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase {


	WebDriver driver;

	@FindBy(xpath = "//div[@class='loc']")
	WebElement bangalore;
	@FindBy(xpath = "//span[contains(text(),'Bengaluru, KA')]")
	WebElement dropdown;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
}
