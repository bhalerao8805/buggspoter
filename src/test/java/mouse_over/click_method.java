package mouse_over;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class click_method {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver d = new ChromeDriver();
	d.get("https://demo.guru99.com/test/simple_context_menu.html");
	d.manage().window().maximize();
	
	WebElement text01=d.findElement(By.xpath("//a[text()='Telecom Project']"));
	Actions act = new Actions(d);
	act.moveToElement(text01).click().build().perform();
	Library.TSS(d);
	
	Thread.sleep(15000);
	d.close();
	
	
}
}
