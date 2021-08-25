import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Afridimaven {

	public static void main(String[] args)
	{
		 //System.setProperty("webdriver.chrome.driver","C:\\afridpi\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("sarin");
		driver.findElement(By.name("email")).sendKeys("Raj5@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select Gender = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		Gender .selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("26-01-1998");
		driver.findElement(By.className("btn btn-success")).click();

	}

}
