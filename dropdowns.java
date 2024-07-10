package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samaja3\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		WebElement sdp=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dp=new Select(sdp);
		dp.selectByIndex(2);
		System.out.println(dp.getFirstSelectedOption());
		dp.selectByVisibleText("INR");
		System.out.println(dp.getFirstSelectedOption().getText());
		
	}

}
