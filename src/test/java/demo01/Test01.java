package demo01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test01 {
	
//	class Test01() {
//		
//	}

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY2MzU4OTg5LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");

		d.manage().window().maximize();

		d.findElement(By.name("email")).sendKeys("hi");
		d.findElement(By.name("pass")).sendKeys("123456789");
		d.findElement(By.id("loginbutton")).click();
		
		Library.TSS(d);

		String s = d.getTitle();
		System.out.println(s);
		Thread.sleep(5000);
		d.close();

	}
}
