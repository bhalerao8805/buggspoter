package methods01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test01 {
	public static void Custmkey(WebElement ele, String value) {
		try{
			if (ele.isDisplayed() && ele.isEnabled()) {
				ele.sendKeys(value);
			}else {
				System.out.println("not display and enable");
			}
		}
		catch(Exception e) {
		System.out.println(e);	
		}
	}
	public static void find_ele(ChromeDriver d,String path) {
		try {
		d.findElement(By.xpath(path));
		}
		catch(Exception c) {
			System.out.println(c);
		}
	}
	
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demo.guru99.com/test/newtours/register.php");
	
//	WebElement Firstname = d.findElement(By.xpath("//input[@name='firsftName']"));
//	WebElement Firstname=find_ele(d , "//input[@name='firsftName']");
	Custmkey(Firstname,"Sau");
	
	
	WebElement lastName = d.findElement(By.xpath("//input[@name='lastName']"));
	Custmkey(lastName,"bha");
	
	WebElement phone = d.findElement(By.xpath("//input[@name='phone']"));
	WebElement userName = d.findElement(By.xpath("//input[@id='userName']"));
	WebElement address1 = d.findElement(By.xpath("//input[@name='address1']"));
	WebElement city = d.findElement(By.xpath("//input[@name='city']"));
//	WebElement state = d.findElement(By.xpath("//input[@name='state']"));
	WebElement postalCode = d.findElement(By.xpath("//input[@name='postalCode']"));
	WebElement email = d.findElement(By.xpath("//input[@name='email']"));
	WebElement password = d.findElement(By.xpath("//input[@name='password']"));
	WebElement confirmPassword = d.findElement(By.xpath("//input[@name='confirmPassword']"));
	WebElement submit = d.findElement(By.xpath("//input[@name='submit']"));
	
	String pass="gasgsadggghxg21124";
	
	Custmkey(phone,"01234578");
	Custmkey(userName,"sahg24574");
	Custmkey(address1,"zzz");
	Custmkey(city,"hingoli");
	Custmkey(postalCode,"431701");
	Custmkey(email,"khvdshjghefdv@hfh.com");
	Custmkey(password,pass);
	Custmkey(confirmPassword,pass);
	submit.click();
	
	
	
	WebElement text = d.findElement(By.xpath("//font(contains[face,'Arial, Helvetica'])"));
	System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Firstname.clear();
	Firstname.sendKeys("Shalini");
}}
