package mouse_over;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExclSheetFetch {

	public static void main(String[] args) throws Exception {
//		https://formy-project.herokuapp.com/autocomplete

		String path = "C:\\Users\\Nobi67\\Documents\\new java project\\Demo\\TestData\\Data.xlsx";

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook Wb = new XSSFWorkbook(file);
		String Data0_0 = Wb.getSheet("sheet1").getRow(6).getCell(1).getStringCellValue();
		String Data0_1 = Wb.getSheet("sheet1").getRow(7).getCell(1).getStringCellValue();
		String Data0_2 = Wb.getSheet("sheet1").getRow(12).getCell(1).getStringCellValue();
		String Data_State = Wb.getSheet("sheet1").getRow(8).getCell(1).getStringCellValue();
		String Data_country = Wb.getSheet("sheet1").getRow(11).getCell(1).getStringCellValue();
		String Data0_3 = Wb.getSheet("sheet1").getRow(9).getCell(1).getStringCellValue();
		String DataPinCode = Wb.getSheet("sheet1").getRow(10).getCell(1).getStringCellValue();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://formy-project.herokuapp.com/autocomplete");

		WebElement address = d.findElement(By.xpath("//input[@id='autocomplete']"));
		address.sendKeys(Data0_0);

		WebElement address1 = d.findElement(By.xpath("//input[@id='street_number']"));
		address1.sendKeys(Data0_1);

		//// input[@id='route']
		WebElement Street1 = d.findElement(By.xpath("//input[@id='route']"));
		Street1.sendKeys(Data0_2);

		WebElement city = d.findElement(By.xpath("//input[@id='locality']"));
		city.sendKeys(Data0_3);
		
		WebElement state = d.findElement(By.xpath("//input[@id='administrative_area_level_1']"));
		state.sendKeys(Data_State);
		
		WebElement country = d.findElement(By.xpath("//input[@id='country']"));
		country.sendKeys(Data_country);

		WebElement PinCode = d.findElement(By.xpath("//input[@id='postal_code']"));
		PinCode.sendKeys(DataPinCode);
		
		Library.TSS(d);

	}
}
