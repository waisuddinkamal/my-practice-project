package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// to find the all links and print href attribute vale
		List<WebElement> webLinks = driver.findElements(By.tagName("a"));
		System.out.println(webLinks.size() + " This is the list of the links");
		for (WebElement links : webLinks) {
			System.out.println(links.getAttribute("href"));
			if(links.getText().equals("My Account")) {
				links.click();
				break;
			}
		}
		driver.close();
	}

}
