package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataModels.LoginData;
import pages.HomePage;
import pages.LoginPage;
import utils.JsonUtils;

public class Login_happyScenario extends TestBase{
	LoginPage loginObject ;
	HomePage homeObject ;
	@DataProvider(name = "positiveProvider")
	public Object [][] getPositiveData() throws IOException {
		String path = "src/test/java/testData/login_data.json";
		return JsonUtils.getSubTestData(path,"positive", LoginData.class);
		}
	@Test(dataProvider = "positiveProvider")
	public void testLogin_CorrectUsernameAndMatchingPassword(LoginData data) throws InterruptedException {
		loginObject = new LoginPage(driver);
		homeObject = new HomePage(driver);
				
		homeObject.openLoginPage();
		
		Assert.assertEquals(loginObject.loginMessage.getText(), "Login to your account");

		loginObject.userCanLogin(data.getEmail(), data.getPassword());
		
		Assert.assertTrue(loginObject.logoutBtn.isEnabled());
		
		loginObject.userCanlogout();
		
		Assert.assertEquals(loginObject.loginMessage.getText(), "Login to your account");
	}
}
