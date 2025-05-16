package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerationPageObjects {

	public WebDriver driver; // this driver is null

	private By firstName = By.xpath("//input[@name='firstname']");

	private By lastName = By.xpath("//input[@name='lastname']");

	private By email = By.xpath("//input[@name='email']");

	private By telephone = By.xpath("//input[@name='telephone']");

	private By password = By.xpath("//input[@name='password']");

	private By confirmpassword = By.xpath("//input[@name='confirm']");

	private By subscribe = By.xpath("(//input[@name='newsletter'])[2]");

	private By PrivacyPolicy = By.xpath("//input[@type='checkbox']");

	private By ContinueButton = By.xpath("//input[@type='submit']");

	private By firstNameErrorMSg = By.xpath("(//div[@class='text-danger'])[1]");

	private By lastNameErrorMSg = By.xpath("(//div[@class='text-danger'])[2]");

	// driver 2 took the scope of driver from register test cases classes
	public registerationPageObjects(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement enterFirstName() {

		return driver.findElement(firstName);

	}

	public WebElement enterLastName() {

		return driver.findElement(lastName);

	}

	public WebElement enterEmail() {

		return driver.findElement(email);

	}

	public WebElement enterTelephone() {

		return driver.findElement(telephone);

	}

	public WebElement enterPassword() {

		return driver.findElement(password);

	}

	public WebElement enterConfirmpassword() {

		return driver.findElement(confirmpassword);

	}

	public WebElement clickOnSubscribe() {

		return driver.findElement(subscribe);
	}

	public WebElement acceptPrivacyPolicy() {

		return driver.findElement(PrivacyPolicy);
	}

	public WebElement clickOnContinueButton() {

		return driver.findElement(ContinueButton);
	}

	public WebElement captureFirstNameErrorMsg() {

		return driver.findElement(firstNameErrorMSg);
	}

	public WebElement captureLastNameErrorMsg() {

		return driver.findElement(lastNameErrorMSg);
	}

}
