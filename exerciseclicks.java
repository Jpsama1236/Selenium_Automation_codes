package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exerciseclicks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samaja3\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).click();
		String label=driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		//String label=driver.findElement(By.cssSelector("input[type='checkbox']")).getText();
		System.out.println(label);
		label= label.toLowerCase();
		
		WebElement sdp=driver.findElement(By.id("dropdown-class-example"));
		Select dp=new Select(sdp);
		dp.selectByValue(label);
		driver.findElement(By.cssSelector("input#name")).sendKeys(label);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String option=driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		if (option.contains(label)) {
			System.out.println("true");
		}
		else {System.out.println("false");}
		

	}

}
