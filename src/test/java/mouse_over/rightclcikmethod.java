package mouse_over;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightclcikmethod {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right = d.findElement(By.xpath("//span[text()='right click me']"));
		WebElement quit = d.findElement(By.xpath("//span[text()='Quit']"));
		Actions act = new Actions(d);
	
	act.contextClick(right).build().perform();
	TakeScreen.TSS(d);
	act.contextClick(quit).build().perform();
	TakeScreen.TSS(d);
	}

}
