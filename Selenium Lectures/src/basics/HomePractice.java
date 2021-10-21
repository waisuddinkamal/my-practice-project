package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement myAccount = driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]"));
		myAccount.click();
		WebElement logIn = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		logIn.click();
		WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email.sendKeys("waisuddinkamal786@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("kamal123");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		System.out.println(driver.getTitle());
		WebElement myAccountForLogout = driver
				.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]"));
		myAccountForLogout.click();
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
		logout.click();
		System.out.println(driver.getTitle());
		driver.close();

	}
}
