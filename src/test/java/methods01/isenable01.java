package methods01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isenable01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/checkbox");
		driver.manage().window().maximize();
		
		 
		WebElement box1 = driver.findElement(By.id("checkbox-2"));
		box1.click();
		
		if (box1.isEnabled() && box1.isDisplayed()) {
			System.out.println(box1.isEnabled()+"    is  Enable");
			System.out.println(box1.isDisplayed()+"    is display");
		}
		else {
			System.out.println("Check box is not enable");
		}
		
		
		
		Thread.sleep(5000);
		
		
		
		
	}

}
