package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://www.qaclickacademy.com/");
driver.findElement(By.xpath(".//*[@id='homepage']/section[2]/div/a")).click();
	}

}
