package rahulshettyacademy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshetty.abstarctComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{

	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		super(driver);
		//initialization(very imp)
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	//WebElement userEmails=driver.findElement(By.id("userEmail"));
	//pageFactory
	@FindBy(id="userEmail")
	WebElement userEmail;//same step as line number 20(aki ...step alternative method)
	
	@FindBy(id="userPassword")
	WebElement passwordele;
	
	@FindBy(id="login")
	WebElement submit;
	
	public void loginApplication(String email,String password) {
		userEmail.sendKeys(email);
		passwordele.sendKeys(password);
		submit.click();
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/");
	}
}

