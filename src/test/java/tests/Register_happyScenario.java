package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataModels.LoginData;
import dataModels.registerData;
import pages.HomePage;
import pages.RegisterPage;
import utils.JsonUtils;

public class Register_happyScenario extends TestBase {
	RegisterPage registerObject;
	HomePage homeObject;
	@DataProvider(name = "positiveProvider")
	public Object [][] getPositiveData() throws IOException {
		String path = "src/test/java/testData/register_data.json";
		return JsonUtils.getSubTestData(path,"positive", registerData.class);}
  @Test (dataProvider = "positiveProvider")
  public void registerWithNewEmail(registerData data) {
	  registerObject = new RegisterPage(driver);
	  homeObject = new HomePage(driver);
	  homeObject.openRegisterPage();
	  Assert.assertEquals(registerObject.signUpMsg.getText(), "New User Signup!");
	  registerObject.userCanRegister("Yahia", "testing2304@gmail.com");
	  registerObject.userCanCreateAccount(data.getPassword(), data.getDay(), data.getMonth(), data.getYear(), data.getFirstName(), data.getLastName(), data.getAddress(), data.getAddress2(), data.getCity(), data.getCountry(), data.getState(), data.getCity(), data.getZipCode(), data.getMobileNumber());
	  Assert.assertTrue(registerObject.successMsg.isDisplayed());
  }
}
