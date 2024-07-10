package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarui {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samaja3\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		while(!driver.findElement(By.cssSelector("span.cur-month")).getText().contains("January") ){
			driver.findElement(By.cssSelector("span.flatpickr-next-month")).click();
			Thread.sleep(3000);
		}
		
		List<WebElement> options=driver.findElements(By.cssSelector("span[class='flatpickr-day ']"));
		for (int i=0;i<options.size();i++) {
			String text=driver.findElements(By.cssSelector("span[class='flatpickr-day '] ")).get(i).getText();
			if(text.equalsIgnoreCase("28")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}

	}

}
