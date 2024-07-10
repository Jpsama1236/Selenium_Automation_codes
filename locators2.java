package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


// TODO Auto-generated method stub

//implicit wait - 2 seconds time out
		String name="rahul";

System.setProperty("webdriver.chrome.driver", "C:\\Users\\samaja3\\Documents\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
String password=getpassword(driver);

driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys(name);

driver.findElement(By.name("inputPassword")).sendKeys(password);

driver.findElement(By.className("signInBtn")).click();

System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText());
Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText(),"You are successfully logged in.");
Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+name+",");
driver.findElement(By.xpath("//*[text()='Log Out']")).click();
driver.close();
}
	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String pass=driver.findElement(By.cssSelector("div[class='form-container sign-up-container'] p")).getText();
		String pass1[]=pass.split("'");
		String pass2=pass1[1].split("'")[0];
		return pass2;
	}



	}

