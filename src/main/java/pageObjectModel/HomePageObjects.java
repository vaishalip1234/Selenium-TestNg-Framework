package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

	public WebDriver driver; // this driver is null

	private By myAccount = By.xpath("//i[@class='fa fa-user']");

	private By register = By.xpath("//a[text()='Register']");

	private By login = By.xpath("//a[text()='Login']");

	// driver 2 took the scope of driver from register test cases classes
	public HomePageObjects(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement ClickOnMyAccount() {

		return driver.findElement(myAccount);

	}

	public WebElement ClickOnRegister() {

		return driver.findElement(register);

	}

	public WebElement ClickOnLogin() {

		return driver.findElement(login);

	}
}
