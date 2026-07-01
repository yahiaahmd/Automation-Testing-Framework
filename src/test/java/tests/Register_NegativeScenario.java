package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;

public class Register_NegativeScenario extends TestBase {
	RegisterPage registerObject;
	HomePage homeObject;
  @Test
  public void registerWithExistEmail() {
	  registerObject = new RegisterPage(driver);
	  homeObject = new HomePage(driver);
	  homeObject.openRegisterPage();
	  Assert.assertEquals(registerObject.signUpMsg.getText(), "New User Signup!");
	  registerObject.userCanRegister("Yahia", "testing2301@gmail.com");
	  Assert.assertTrue(registerObject.errorMsg.isDisplayed());
}
}
  
