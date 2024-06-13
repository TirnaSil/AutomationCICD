package rahulshetty.abstarctComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {//parent class it is
	WebDriver driver;
	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public void ElementToAppear(By findBY) {
		
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBY));
}
}