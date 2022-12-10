package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DemoGuruRegsiterPage {

	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement txt_FirstName;
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	private WebElement txt_LastName;
	@FindBy(how= How.XPATH,using="//input[@name='phone']")
	private WebElement int_phone;
	@FindBy(how=How.XPATH,using="//input[@id='userName']")
	private WebElement Txt_Email;
	@FindBy(how=How.XPATH,using="//input[@name='address1']")
	private WebElement Txt_address1;
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	private WebElement Txt_city;
	@FindBy(how=How.XPATH,using="//input[@name='state']")
	private WebElement Txt_state;
	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")
	private WebElement int_postcode;
	@FindBy(how=How.XPATH,using="//input[@name='country']")
	private WebElement txt_country;
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_username;
	@FindBy(how=How.XPATH,using="//input[@type='password'][1]")
	private WebElement txt_passWord;
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
	private WebElement txt_cpassword;
	@FindBy(how=How.XPATH,using="//input[@name='submit']")
	private WebElement btn_submit;
	public WebElement getTxt_FirstName() {
		return txt_FirstName;
	
	}
	public WebElement getTxt_LastName() {
		return txt_LastName;
	}
	
	public WebElement getInt_phone() {
		return int_phone;
	}
	
	public WebElement getTxt_Email() {
		return Txt_Email;
	}
	
	public WebElement getTxt_address1() {
		return Txt_address1;
	}
	
	public WebElement getTxt_city() {
		return Txt_city;
	}
	
	public WebElement getTxt_state() {
		return Txt_state;
	}
	
	public WebElement getInt_postcode() {
		return int_postcode;
	}
	
	public WebElement getTxt_country() {
		return txt_country;
	}
	
	public WebElement getTxt_username() {
		return txt_username;
	}
	
	public WebElement getTxt_passWord() {
		return txt_passWord;
	}
	
	public WebElement getTxt_cpassword() {
		return txt_cpassword;
	}
	
	public WebElement getBtn_submit() {
		return btn_submit;
	}

	
	

}
