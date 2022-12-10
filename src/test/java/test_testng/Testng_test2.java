package test_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DemoGuruRegsiterPage;
import pages.LoginPom;

public class Testng_test2 {
	WebDriver Driver;
	@BeforeSuite
	public void BS() {
		
	}
	@BeforeClass
	public void BC() {
		
	}
	@BeforeTest
	public void BT() {
		
	}
	@BeforeMethod(groups= {"fb"})
	public void BM(){
//		if(Test01().) {
			WebDriverManager.chromedriver().setup();
			Driver =new ChromeDriver();
			Driver.manage().window().maximize();
//		}
//		if() {
//			WebDriverManager.edgedriver().setup();
//			Driver = new EdgeDriver();
//		}
		
	
	}
	@Test(groups = {"fb"})
	public void Test01() throws Exception {
		Driver.get("https://www.facebook.com/login");
		LoginPom login=PageFactory.initElements(Driver, LoginPom.class);
		login.getTet_email().sendKeys("Test@gmail.com");
		login.getTet_passward().sendKeys("1235456");
		login.getTet_butsubmit().click();
		Thread.sleep(2000);
	}
	@Test(groups= {"demo"})
	public void Test02() throws Exception {
		Driver.get("https://demo.guru99.com/test/newtours/register.php");
		DemoGuruRegsiterPage reg=PageFactory.initElements(Driver, DemoGuruRegsiterPage.class);
		
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
		reg.getBtn_submit().click();
		Thread.sleep(2000);
	}
	@AfterMethod(groups= {"fb"})
	public void AM() {
		Driver.close();
		
	}
	@AfterTest
	public void AT() {
		
	}
	@AfterClass
	public void AC() {
		
	}
	@AfterSuite
	public void AS() {
		
	}

}
