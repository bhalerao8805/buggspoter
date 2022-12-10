package demo01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPom;

public class FbLogin {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/login");
	
	//call the  getter ad seter method in the main method
	LoginPom login=PageFactory.initElements(d, LoginPom.class);
	login.getTet_email().sendKeys("Test@gmail.com");
	login.getTet_passward().sendKeys("1235456");
	login.getTet_butsubmit().click();
}}
