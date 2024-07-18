package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samaja3\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(1000);
		List<WebElement> option=driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		
		for(WebElement e:option) {
			System.out.println(e.getText());
			if(e.getText().equalsIgnoreCase("India")){
				e.click();
				System.out.println("Option selected");
				
				break;
				//String val=driver.findElement(By.xpath("//*[@id='autocomplete']")).getText().toString();
				//System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("placeholder"));
			}
		}
driver.quit();
	}

}
