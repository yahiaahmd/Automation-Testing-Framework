package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="name")
	WebElement nameTxt;
	@FindBy(css="#form > div > div.row > div:nth-child(3) > div > form > input[type=email]:nth-child(3)")
	WebElement emailTxt;
	@FindBy(css = "#form > div > div.row > div:nth-child(3) > div > h2")
	public WebElement signUpMsg;
	@FindBy(css = "#form > div > div.row > div:nth-child(3) > div > form > button")
	WebElement registerBtn;
	@FindBy(id="id_gender1")
	WebElement gender;
	@FindBy(id="password")
	WebElement passwordTxt;
	@FindBy(id="days")
	public WebElement dayDropDown;
	@FindBy(id="months")
	public WebElement monthDropDown;
	@FindBy(id="years")
	public WebElement yearDropDown;
	@FindBy(id="newsletter")
	WebElement newsLetter;
	@FindBy(id="optin")
	WebElement specialOffers;
	@FindBy(id="first_name")
	WebElement firstNameTxt;
	@FindBy(id="last_name")
	WebElement lastNameTxt;
	@FindBy(id="company")
	WebElement companyTxt;
	@FindBy(id="address1")
	WebElement addressTxt;
	@FindBy(id="address2")
	WebElement address2Txt;
	@FindBy(id="country")
	WebElement countryOptions;
	@FindBy(id="state")
	WebElement stateTxt;
	@FindBy(id="city")
	WebElement cityTxt;
	@FindBy(id="zipcode")
	WebElement zipcodeTxt;
	@FindBy(id="mobile_number")
	WebElement mobileNumberTxt;
	@FindBy(css="#form > div > div.row > div > div > form > button")
	WebElement createBtn;
	@FindBy(css= "#form > div > div.row > div > h2 > b")
	public WebElement successMsg;
	@FindBy(css= "#form > div > div.row > div:nth-child(3) > div > form > p")
	public WebElement errorMsg;
	public void userCanRegister(String name, String email) {
		nameTxt.sendKeys(name);
		emailTxt.sendKeys(email);
		registerBtn.click();
	}
	
	public void userCanCreateAccount(String password, String day, String month, String year, String firstName, String lastName, String company,  String address, String address2, String country, String state, String city, String zipCode, String mobileNumber) {
		gender.click();
		passwordTxt.sendKeys(password);
		new Select(dayDropDown).selectByVisibleText(day);
		new Select(monthDropDown).selectByVisibleText(month);
		new Select(yearDropDown).selectByVisibleText(year);
		firstNameTxt.sendKeys(firstName);
		lastNameTxt.sendKeys(lastName);
		companyTxt.sendKeys(company);
		addressTxt.sendKeys(address);
		address2Txt.sendKeys(address2);
		new Select(countryOptions).selectByVisibleText(country);
		stateTxt.sendKeys(state);
		cityTxt.sendKeys(city);
		zipcodeTxt.sendKeys(zipCode);
		mobileNumberTxt.sendKeys(mobileNumber);
		createBtn.click();
	}
	
}
