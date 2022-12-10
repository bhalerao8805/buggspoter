package methods01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_prf {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver d = new ChromeDriver();
	d.get("https://demo.guru99.com/test/newtours/register.php");
	d.manage().window().maximize();
	WebElement firstName = d.findElement(By.name("firstName"));
	firstName.sendKeys("Saurabh");
	
	WebElement lastName = d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
	lastName.sendKeys("bhalerao");
	
	WebElement phone = d.findElement(By.name("phone"));
	phone.sendKeys("0123456789");
	
	
	WebElement userName = d.findElement(By.xpath("//input[@id='userName']"));
	userName.sendKeys("Sau123");
	
	
	WebElement address1 = d.findElement(By.xpath("//input[@name='address1']"));
	address1.sendKeys("nanded");
	
	
	WebElement city = d.findElement(By.xpath("//input[@name='city']"));	
	city.sendKeys("nanded");
	
	
	WebElement state = d.findElement(By.xpath("//input[@name='state']"));
	state.sendKeys("Maharastra");
	
	
	WebElement postalCode = d.findElement(By.xpath("//input[@name='postalCode']"));
	postalCode.sendKeys("0123456");
	
	
	WebElement email = d.findElement(By.id("email"));
	email.sendKeys("bhalerasaurabh54323@gmail.com");
	
	
	WebElement password = d.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("0123456");
	
	
	WebElement confirmPassword = d.findElement(By.xpath("//input[@name='confirmPassword']"));
	confirmPassword.sendKeys("0123456");
	
	
	WebElement btn = d.findElement(By.name("submit"));
	btn.click();
	
	WebElement text1 = d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
	
	System.out.println(text1.getText());

}
}
