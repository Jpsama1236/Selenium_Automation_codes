package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sortitems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement>options=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> values=options.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedlist=values.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(values.equals(sortedlist));
		List<String> prices;
		// do while loop for iterating through pages
		do {
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		prices=rows.stream().filter(s->s.getText().contains("Carrot")).map(s->getPrice(s)).collect(Collectors.toList());
		prices.stream().forEach(s->System.out.println(s));
		if(prices.size()<1) {
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
	}while(prices.size()<1);
	
	}
	private static String getPrice(WebElement s) {
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
}
