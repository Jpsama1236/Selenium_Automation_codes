package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samaja3\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
