package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Resources.baseClass;
import com.Resources.commonMethods;
import com.Resources.Constants;

import pageObjectModel.HomePageObjects;
import pageObjectModel.registerationPageObjects;

public class RegisterTestCases extends baseClass {

	public static String randomEmail = "";

	@Test
	public void verifyRegisterationWithInBlankData() throws IOException, InterruptedException {

		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.putExplicitwait(driver, 5, hpo.ClickOnMyAccount());
		hpo.ClickOnMyAccount().click();
		hpo.ClickOnRegister().click();

		registerationPageObjects rpo = new registerationPageObjects(driver);
		rpo.enterFirstName().sendKeys("");
		rpo.enterLastName().sendKeys("");
		rpo.enterEmail().sendKeys("");
		rpo.enterTelephone().sendKeys("");
		rpo.enterPassword().sendKeys("");
		rpo.enterConfirmpassword().sendKeys("");
		rpo.clickOnSubscribe().click();
		// rpo.acceptPrivacyPolicy().click();
		rpo.clickOnContinueButton().click();

		/*
		 * SoftAssert sa = new SoftAssert(); //it is not mandatory to write all this
		 * code. String firstNameErrorMsg = Constants.firstNameErrorMSg; String
		 * lastNameErrorMsg = Constants.lastNameErrorMSg; String firstNameErrorMSg =
		 * "First Name must be between 1 and 32 characters!"; String lastNameErrorMSg =
		 * "Last Name must be between 1 and 32 characters!";
		 * sa.assertEquals(rpo.captureFirstNameErrorMsg().getText(), firstNameErrorMSg);
		 * sa.assertEquals(rpo.captureLastNameErrorMsg().getText(), lastNameErrorMSg);
		 * sa.assertAll();
		 */

		commonMethods.handleAssertions(rpo.captureFirstNameErrorMsg().getText(), Constants.firstNameErrorMSg);

		commonMethods.handleAssertions(rpo.captureLastNameErrorMsg().getText(), Constants.lastNameErrorMSg);

	}

	// you can generate random data by faker
	// https://stackoverflow.com/questions/20536566/creating-a-random-string-with-a-z-and-0-9-in-java
	// https://www.youtube.com/watch?v=RWtM5AQaiA8

	@Test(dependsOnMethods = "verifyRegisterationWithInBlankData")
	public void verifyRegisterationWithValidData() throws IOException, InterruptedException {

		randomEmail = generateRandomEmail();
		registerationPageObjects rpo = new registerationPageObjects(driver);

		commonMethods.putExplicitwait(driver, 10, rpo.enterFirstName());
		rpo.enterFirstName().clear();
		rpo.enterFirstName().sendKeys(Constants.firstname);
		rpo.enterLastName().sendKeys(Constants.lastname);
		rpo.enterEmail().sendKeys(randomEmail);
		rpo.enterTelephone().sendKeys(Constants.telephone);
		rpo.enterPassword().sendKeys(Constants.password);
		rpo.enterConfirmpassword().sendKeys(Constants.confirmpassword);
		rpo.clickOnSubscribe().click();
		Thread.sleep(2000);
		rpo.acceptPrivacyPolicy().click();
		rpo.clickOnContinueButton().click();

		/*
		 * SoftAssert sa = new SoftAssert(); String successUrl = Constants.successUrl;
		 * sa.assertEquals(driver.getCurrentUrl(), successUrl); sa.assertAll()
		 */

		commonMethods.handleAssertions(driver.getCurrentUrl(), Constants.successUrl);

	}

}
