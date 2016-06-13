package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("pranav");
driver.findElement(By.name("pass")).sendKeys("12345");
driver.findElement(By.id("u_0_o")).click();

	}

}
