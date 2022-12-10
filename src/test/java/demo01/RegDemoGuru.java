package demo01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DemoGuruRegsiterPage;

public class RegDemoGuru {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver d = new ChromeDriver();
//	d.manage().window().maximize();
	d.get("https://demo.guru99.com/test/newtours/register.php");
	
	
	// callin the element
	
	DemoGuruRegsiterPage reg=PageFactory.initElements(d, DemoGuruRegsiterPage.class);
	
	reg.getTxt_FirstName().sendKeys("FirstName");
	reg.getTxt_LastName().sendKeys("LastName");
	reg.getTxt_address1().sendKeys("1st address");
	reg.getTxt_city().sendKeys("city");
	reg.getTxt_Email().sendKeys("email@email.com");
	reg.getTxt_state().sendKeys("stae");
	reg.getInt_postcode().sendKeys("123456");
	reg.getInt_phone().sendKeys("123456789");
	reg.getTxt_username().sendKeys("username");
	reg.getTxt_passWord().sendKeys("password");
	reg.getTxt_cpassword().sendKeys("confirm password");
//	reg.getBtn_submit().click();
	
	
}
}
