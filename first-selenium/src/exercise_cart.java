import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exercise_cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sama Jayaprakash\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String name=driver.findElement(By.cssSelector("div[class='form-group'] p")).getText();
		String[] names=name.split(" ");
		String usname=names[2].trim();String pass=names[6].trim();
		StringBuffer sb=new StringBuffer(pass);
		sb.deleteCharAt(sb.length()-1);
		driver.findElement(By.id("username")).sendKeys(usname);
		driver.findElement(By.id("password")).sendKeys(sb);
		driver.findElement(By.xpath("//label[2]/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id='okayBtn']")).click();
		Thread.sleep(1000);
		WebElement  sdp=driver.findElement(By.cssSelector("select.form-control"));
		Select dp=new Select(sdp);
		dp.selectByIndex(0);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(1000);
		List products=driver.findElements(By.cssSelector("button.btn"));
		for(int i=0;i<products.size();i++) {
			
			driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();
		}
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
		

	}

}
