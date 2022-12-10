package demo01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFB {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("name@gmail.com");
		
		WebElement Password= driver.findElement(By.name("pass"));
		Password.sendKeys("123467889");
		
		WebElement Loginbtn= driver.findElement(By.name("login"));
		Loginbtn.click();
		
		
		
		
		
		
		Thread.sleep(000);
		driver.close();
		
	}

}
