package demo01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.edgedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
			
			
			String title=driver.getTitle();
			System.out.println(title);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(5000);
			driver.close();
	}

}
