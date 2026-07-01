package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataModels.registerData;
import pages.HomePage;
import pages.RegisterPage;
import utils.JsonUtils;

public class Register_NegativeScenario extends TestBase {
	RegisterPage registerObject;
	HomePage homeObject;
	@DataProvider(name = "negativeProvider")
	public Object [][] getNegativeeData() throws IOException {
		String path = "src/test/java/testData/register_data.json";
		return JsonUtils.getSubTestData(path,"negative", registerData.class);}
  @Test (dataProvider = "negativeProvider")
  public void registerWithExistEmail(registerData data) {
	  registerObject = new RegisterPage(driver);
	  homeObject = new HomePage(driver);
	  homeObject.openRegisterPage();
	  Assert.assertEquals(registerObject.signUpMsg.getText(), "New User Signup!");
	  registerObject.userCanRegister(data.getName(), data.getEmail());
	  Assert.assertTrue(registerObject.errorMsg.isDisplayed());
}
}
  
