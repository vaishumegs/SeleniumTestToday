package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleDemo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\v.ramiya.surendran\\Downloads\\geckodriver.exe");
      
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("invalidUN");
        driver.findElement(By.name("password")).sendKeys("invalidPW");
        driver.findElement(By.name("login")).click();

	}

}
