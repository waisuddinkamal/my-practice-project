package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcctionClass {

	public static void main(String[] args) throws InterruptedException {
		// Action method it is covering the mouse Hover, double click, and context click (right click)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail/");
		Actions action = new Actions(driver);
		WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
		action.moveToElement(desktops).build().perform();
		action.doubleClick(desktops).build().perform();
		action.contextClick(desktops).build().perform();
		
		Thread.sleep(5000);
		// drag and drop Handling 
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement traget = driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, traget).build().perform();
		driver.close();

	}

}
