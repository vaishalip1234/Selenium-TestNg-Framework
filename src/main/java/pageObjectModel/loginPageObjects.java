package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {

	public WebDriver driver; // this driver is null

	private By email = By.xpath("//input[@name='email']");

	private By password = By.xpath("//input[@name='password']");

	private By login = By.xpath("//input[@value='Login']");

	// driver 2 took the scope of driver from register test cases classes
	public loginPageObjects(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement enterEmail() {

		return driver.findElement(email);

	}

	public WebElement enterPassword() {

		return driver.findElement(password);

	}

	public WebElement clickOnLogin() {

		return driver.findElement(login);

	}
}
