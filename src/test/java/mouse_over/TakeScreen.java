package mouse_over;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class TakeScreen {
	
	public static void TSS(ChromeDriver element) throws Exception {
		String RM = RandomString.make(3);

		TakesScreenshot ts = (TakesScreenshot) element;

		File src = ts.getScreenshotAs(OutputType.FILE);
		File destn = new File("C:\\Users\\Nobi67\\Documents\\new java project\\Demo\\ScreenShot\\" + RM + ".png");
		FileUtils.copyFile(src, destn);
		
	}
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		TakeScreen.TSS(driver);

		
	}

}
