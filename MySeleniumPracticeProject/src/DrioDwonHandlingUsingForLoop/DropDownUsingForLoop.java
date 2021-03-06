package DrioDwonHandlingUsingForLoop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingForLoop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement from = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		from.clear();
		from.sendKeys("london");
		List<WebElement> departure = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		for (int i = 0; i < departure.size(); i++) {
			if (departure.get(i).getText().contains("LGW")) {
				departure.set(i, from).click();
				break;
			}

		}

		WebElement to = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		to.clear();
		to.sendKeys("wash");
		List<WebElement> arival = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li/a"));
		for (int i = 0; i < arival.size(); i++) {
			if (arival.get(i).getText().equals("PSC - Pasco Tri Cities, WA")) {
				arival.set(i, to).click();
				break;
			}

		}

		WebElement NumberOfPassengers = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
		Select select = new Select(NumberOfPassengers);
		select.selectByValue("5");
		driver.close();
	}

}
