package methods01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class new_task {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver d = new ChromeDriver();
	
	d.manage().window().maximize();
	
	d.get("https://covid19health.bihar.gov.in/Account/Login");
	
	WebElement a = d.findElement(By.id("Email"));
	WebElement b = d.findElement(By.id("login-password"));
	WebElement c =d.findElement(By.id("RememberMe"));

	
	a.sendKeys("hiiii@noresult");
	b.sendKeys("nopassword");
	c.click();
	
	if(c.isEnabled()) {
System.out.println("Is enable");
if (c.isDisplayed()) {
	System.out.println("is display");
}
	}
}}
