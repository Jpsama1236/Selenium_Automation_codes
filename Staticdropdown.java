package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dpdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dp=new Select(dpdown);
		dp.selectByIndex(3);
		System.out.println(dp.getFirstSelectedOption().getText());
		dp.selectByVisibleText("AED");
		System.out.println(dp.getFirstSelectedOption().getText());
		dp.selectByValue("INR");
		System.out.println(dp.getFirstSelectedOption().getText());
	}

}
