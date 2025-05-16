package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Resources.Constants;
import com.Resources.baseClass;

import pageObjectModel.HomePageObjects;
import pageObjectModel.loginPageObjects;

@Test
public class LoginTestCases extends baseClass {

	public void invalidLoginTest() throws IOException {

		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.ClickOnMyAccount().click();
		hpo.ClickOnLogin().click();

		loginPageObjects lpo = new loginPageObjects(driver);
		lpo.enterEmail().sendKeys(RegisterTestCases.randomEmail);
		lpo.enterPassword().sendKeys(Constants.password);
		lpo.clickOnLogin().click();

	}
}
