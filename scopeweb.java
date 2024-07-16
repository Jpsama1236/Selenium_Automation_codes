package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scopeweb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samaja3\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//1. get the count of all links in the page
		
		System.out.println(driver.findElements(By.tagName("a")).size());
 //2. count of tags in footer section
		WebElement footdriver =driver.findElement(By.id("gf-BIG"));
		System.out.println(footdriver.findElements(By.tagName("a")).size());
 // 3.count of links in first column under footer section
		WebElement columndriver=footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
//4 check the links of all given in above scope and get text  of those websites
		int length1=columndriver.findElements(By.tagName("a")).size();
		for (int i=0;i<length1;i++) {
			String keys1=Keys.chord(Keys.SHIFT,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(keys1);
		}
		
	}

}
