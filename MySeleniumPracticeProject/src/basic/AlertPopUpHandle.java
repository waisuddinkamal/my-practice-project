package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.xpath("(//a[@href='https://mail.rediff.com/cgi-bin/login.cgi'])[2]"));
		login.click();
		Thread.sleep(3000);
		WebElement signIn = driver.findElement(By.name("proceed"));
		signIn.click();
		Thread.sleep(3000);
		// Alert is a class in Selenium
		// switch method is switching the web site to the popUp window
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText()); // printing the pop Up window title
		String text = alert.getText();
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct Alert Message");
		}

		else {
			System.out.println("Alert Message is not Correct");

		}
		alert.accept(); // this method is accepting on clicking the oky
		// alret.dismiss(); // if we have cancel on pop up this method is click on it
		driver.close();

	}

}
