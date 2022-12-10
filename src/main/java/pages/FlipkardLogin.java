package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlipkardLogin {

	@FindBy(how=How.XPATH, using="//input[contains(@class,'2IX_2-')][1]")
	private WebElement txt_login;
	
	@FindBy(how=How.XPATH, using="//input[contains(@class,'2IX_2-')][2]")
	private WebElement txt_password;

	public WebElement getTxt_login() {
		return txt_login;
	}

	
	public WebElement getTxt_password() {
		return txt_password;
	}

	
}
