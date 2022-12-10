package demo01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task01 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/autocomplete");
	
driver.manage().window().maximize();

WebElement address= driver.findElement(By.id("autocomplete"));
address.sendKeys("new aadddress is that is no more");

WebElement straddress= driver.findElement(By.id("street_number"));
straddress.sendKeys("this is new input");

WebElement straddress2= driver.findElement(By.id("route"));
straddress2.sendKeys("straddress2");

WebElement locality= driver.findElement(By.id("locality"));
locality.sendKeys("New locality");

WebElement State= driver.findElement(By.id("administrative_area_level_1"));
State.sendKeys("Maharastra");

WebElement pin= driver.findElement(By.id("postal_code"));
pin.sendKeys("411014");


WebElement country= driver.findElement(By.id("country"));
country.sendKeys("India");

Thread.sleep(5000);
driver.close();
}
}
