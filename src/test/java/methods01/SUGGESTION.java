package methods01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SUGGESTION {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drivers = new ChromeDriver();
		drivers.get("https://www.google.com/");
		drivers.manage().window().maximize();
		WebElement srcbar = drivers.findElement(By.xpath("//input[@name='q']"));
		srcbar.sendKeys("maven");
		Thread.sleep(3000);
		List<WebElement> list = drivers.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("maven meaning")) {
				list.get(i).click();
				break;
			}
		}
	}
}
