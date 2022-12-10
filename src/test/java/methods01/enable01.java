package methods01;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class enable01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/checkbox");
		driver.manage().window().maximize();
		
		WebElement box1=driver.findElement(By.id("checkbox-1"));
		WebElement box2=driver.findElement(By.id("checkbox-2"));
		WebElement box3=driver.findElement(By.id("checkbox-3"));
		WebElement logo=driver.findElement(By.id("logo"));
		box1.click();
		if (box3.isEnabled() && box3.isDisplayed()) {
			box3.click();
		}else {
			System.out.println("is not enable");
		}
	
		
		Thread.sleep(2000);
		
		System.out.println(box1.isEnabled());
		System.out.println(box1.isDisplayed());
		
		
		driver.close();
		
	}

}
