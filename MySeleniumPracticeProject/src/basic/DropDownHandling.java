package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandling {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/");
		WebElement dropDwonTo = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		dropDwonTo.clear();
		dropDwonTo.sendKeys("london"); 
		List<WebElement> arivel = driver.findElements(By.xpath("//a[@id='ui-id-89']"));
		for (WebElement CityArivle : arivel) {
			if (CityArivle.getText().contains("LGW - London Gatwick, United Kingdom")) {
				CityArivle.click();
				break;
			}
			driver.close();
		}

	}

}
