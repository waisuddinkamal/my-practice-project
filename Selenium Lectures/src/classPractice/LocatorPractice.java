package classPractice;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("waisuddinkamal@yahoo.com");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.sendKeys("Raminjan@1");
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		login.click();
		

	}

}
