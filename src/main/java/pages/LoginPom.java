package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	@FindBy(how = How.XPATH, using = "//input[@name='email']")
	private WebElement tet_email;

	@FindBy(how = How.XPATH, using = "//input[@name='pass']")
	private WebElement tet_passward;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement tet_butsubmit;

	public WebElement getTet_email() {
		return tet_email;
	}

	public WebElement getTet_passward() {
		return tet_passward;

	}

	public WebElement getTet_butsubmit() {
		return tet_butsubmit;
	
	}
}
