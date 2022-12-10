import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {public static void chrome() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver Driver = new ChromeDriver();
	Driver.manage().window().maximize();
}
}
