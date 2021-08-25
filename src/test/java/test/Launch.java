package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	public static void main(String[] args) {
		 //System.setProperty("webdriver.chrome.driver","C:\\afridpi\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
			
			WebElement jobTitle = driver.findElement(By.name("UserTitle"));
			Select jobTitleListtitle = new Select(jobTitle);

			List<WebElement> options =  jobTitleListtitle.getOptions();

			for (int index = 0; index < options.size(); index++) {
				System.out.println(options.get(index).getText());
			}
			WebElement Employee = driver.findElement(By.name("CompanyEmployees"));
			Select EmployeeListtitle = new Select(Employee);

			List<WebElement> options1 =  EmployeeListtitle.getOptions();

			for (int index = 0; index < options1.size(); index++) {
				System.out.println(options1.get(index).getText());
			}
			WebElement Country = driver.findElement(By.name("CompanyCountry"));
			Select CountryListtitle = new Select(Country);

			List<WebElement> options2 =  CountryListtitle.getOptions();

			for (int index = 0; index < options2.size(); index++) {
				System.out.println(options2.get(index).getText());
			}

	}

}
