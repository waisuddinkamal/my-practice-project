package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownWithCalandar {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");

		WebElement from = driver.findElement(By.id("src"));
		from.clear();
		from.sendKeys("bang");
		List<WebElement> calandarList = driver.findElements(By.xpath("//ul[@class='autoFill']"));
		for (WebElement departure : calandarList) {
			if (departure.equals("Madiwala, Bangalore")) {
				departure.click();
				break;

			}
		}
		WebElement to = driver.findElement(By.id("dest"));
		to.clear();
		to.sendKeys("Delhi");
		List<WebElement> arival = driver.findElements(By.xpath("//ul[@class='autoFill']"));
		for (WebElement ariv : arival) {
			if (ariv.equals("Dehradun")) {

				ariv.click();
				break;
			}
		}
		WebElement clandar = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		clandar.click();

		List<WebElement> date = driver.findElements(By.xpath("//td[contains(text(),'13')]"));
		for (int i = 0; i < date.size(); i++) {
			String dates = date.get(i).getText();

			if (dates.equals("13")) {
				date.get(i).click();
				break;
			}

		}
		WebElement search = driver.findElement(By.id("search_btn"));
		search.click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

	}

}
