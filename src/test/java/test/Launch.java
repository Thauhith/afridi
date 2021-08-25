package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	public static void main(String[] args) {
		 //System.setProperty("webdriver.chrome.driver","C:\\afridpi\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");

	}

}
