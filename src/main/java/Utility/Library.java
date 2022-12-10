package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.utility.RandomString;

public class Library {
	public static void TSS(WebDriver driver) throws Exception {
		String RM = RandomString.make(3);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Nobi67\\Documents\\new java project\\Demo\\ScreenShot\\" + RM + ".png");
		FileUtils.copyFile(src, dest);

	}

	public static void TSS(WebElement element) throws Exception {
		String RM = RandomString.make(5);

		File see = element.getScreenshotAs(OutputType.FILE);

		File destn = new File("C:\\Users\\Nobi67\\Documents\\new java project\\Demo\\ScreenShot\\" + RM + ".png");
		FileUtils.copyFile(see, destn);
	}

	public static void ScrollElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void custom_sendkey(WebElement element, String value) {
		try {
			element.sendKeys(value);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
