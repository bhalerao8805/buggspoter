package test_testng;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPom;

public class Test_es1 extends Base_Class {
	
	
	@Test
	public void TestCE1() {
		LoginPom login =PageFactory.initElements(driver, LoginPom.class);
		login.getTet_email().sendKeys("Saurabh");
		login.getTet_passward().sendKeys("123456789");
		login.getTet_butsubmit().click();
	
	}

}
