package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataModels.LoginData;
import pages.HomePage;
import pages.LoginPage;
import utils.JsonUtils;

public class Login_NegativeScenario extends TestBase{
	LoginPage loginObject ;
	HomePage homeObject ;
	@DataProvider(name = "negativeProvider")
	public Object [][] getNotMatchingPasswordData() throws IOException {
		String path = "src/test/java/testData/login_data.json";
		return JsonUtils.getSubTestData(path,"negative", LoginData.class);
		}
	
	@Test (dataProvider = "negativeProvider")
	public void testInvalidLogin(LoginData data) throws InterruptedException {
		loginObject = new LoginPage(driver);
		homeObject = new HomePage(driver);
				
		homeObject.openLoginPage();
		
		Assert.assertEquals(loginObject.loginMessage.getText(), "Login to your account");
		loginObject.userCanLogin(data.getEmail(),data.getPassword());
	    Assert.assertTrue(loginObject.loginFailed.isDisplayed());

	}
	
	
}

