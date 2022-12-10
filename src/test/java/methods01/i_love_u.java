package methods01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class i_love_u {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver shalu = new ChromeDriver();
		
		shalu.get("https://web.whatsapp.com/");
		shalu.switchTo().frame(0);
		WebElement s = shalu.findElement(By.xpath("//span[@title='Majha फुलपाखरु'][1]"));
		s.click();
		
		Thread.sleep(1000);
		
		
//		span[contains(text(),'sweetu')]"
	}

}
