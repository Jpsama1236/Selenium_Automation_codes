package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector(".paxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=0;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		

	}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.cssSelector(".paxinfo")).getText());
	}
}
