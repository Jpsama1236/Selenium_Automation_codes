package introduction;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windows {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samaja3\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		driver.get("https://www.rahulshettyacademy.com/");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"));
		links.stream().forEach(s->System.out.println(s.getText()));
		String text=driver.findElement(By.xpath("//a[contains(text(),'Core java for Automation Testers + Interview Progr')]")).getText();
		driver.switchTo().window(parentid);
		WebElement wb=driver.findElement(By.cssSelector("[name='name']"));
		wb.sendKeys(text);
		File file=wb.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		// get height and width of webelement
		System.out.println(wb.getRect().getDimension().height);
		System.out.println(wb.getRect().getDimension().width);
	}

}
