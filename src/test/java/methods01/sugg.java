package methods01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sugg {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.myntra.com/");
		
		WebElement Serbar = d.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		Serbar.sendKeys("iphone");
		
		List<WebElement> list= d.findElements(By.xpath("//li[@class='desktop-suggestionTitle']"));
		System.out.println(list.size());
	}

}
