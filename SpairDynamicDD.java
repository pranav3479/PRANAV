package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpairDynamicDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.flyfrontier.com/");
driver.findElement(By.xpath("//input[@name='kendoDepartFrom_input']")).click();
driver.findElement(By.xpath("//div[@class='k-list-scroller']/ul[1]/li[13]/div[1]")).click();
	}

}
