package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassExercis {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/hotel");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
		System.out.println(signIn.isDisplayed());
		signIn.click();
		WebElement emailAddress = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		emailAddress.sendKeys("studenthawks@gmail.com");
		password.sendKeys("123456");
		WebElement signInButton = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]"));
		signInButton.click();
		System.out.println(driver.getTitle());
		
		takeScreenShot()

	}

}
