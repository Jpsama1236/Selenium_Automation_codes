package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samaja3\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
		System.out.println(rows.size());
		
		//3. display the second row
		List<WebElement>row2=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]/td"));
		System.out.println(row2.size());
		for (WebElement e: row2) {
			System.out.println(e.getText());
		}

	}

}
