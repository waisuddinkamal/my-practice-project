package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size() + " This is the list od div");
		for (WebElement webelements : elements) {
			System.out.println(elements.getText("div"));
			if (links.getText().equals("My Account")) {
				links.click();
				break;
			}
		}
		driver.close();

	}

}
