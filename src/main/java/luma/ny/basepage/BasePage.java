package luma.ny.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static Properties pro;
	public static WebDriver driver;
	
	
	public BasePage() {
		 pro = new Properties();
		
		
		try {
			
			FileInputStream filelocation = new FileInputStream("C:\\Users\\hassi\\Documents\\Ec\\Luma_Automation_Framework2\\src\\main\\java\\luma\\ny\\config\\Config.properties");
			pro.load(filelocation);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		
	
	
	
	public static void getIntinization() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("URL"));
		
	}
}
