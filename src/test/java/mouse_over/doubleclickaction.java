package mouse_over;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleclickaction {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver d = new ChromeDriver();
	
	d.manage().window().maximize();
	d.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	Actions act = new Actions(d);
	
	
	WebElement dclcik = d.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	act.doubleClick(dclcik).build().perform();
	TakeScreen.TSS(d);
	
	Thread.sleep(1000);
	d.close();
}
}
