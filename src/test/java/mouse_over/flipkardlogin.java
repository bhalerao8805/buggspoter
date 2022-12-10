package mouse_over;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FlipkardLogin;

public class flipkardlogin {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2F%3Frd%3D0%26link%3Dhome_account");
	driver.manage().window().maximize();
	
	FlipkardLogin fb=PageFactory.initElements(driver, FlipkardLogin.class);
	fb.getTxt_login().sendKeys("Test@flipksrd.com");
	fb.getTxt_password().sendKeys("gsfdduyffkhksh");
	
}
}
