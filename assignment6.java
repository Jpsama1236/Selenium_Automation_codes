package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String option=driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[2]")).getText();
		//System.out.println(option);
		WebElement e1=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(e1);
		s.selectByVisibleText(option);
		//s.selectByValue(option);
	
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		String text1=driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		String[] arr=text1.split(" ");
		StringBuilder sb=new StringBuilder(arr[1]);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		
		Assert.assertEquals(option, sb);

	}

}
