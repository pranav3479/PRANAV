package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinksinFooter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions abc=new Actions(driver);
		/*abc.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"))).build().perform();
		WebElement footer=driver.findElement(By.xpath(".//*[@id='navFooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());*/
		System.out.println(driver.getTitle());
		WebElement element=driver.findElement(By.xpath(".//*[@id='navFooter']/table/tbody/tr/td[1]"));
		int count=0;
		count=element.findElements(By.tagName("a")).size();
		for(int i=0;i<count;i++)
		{
			String link=element.findElements(By.tagName("a")).get(i).getText();
			if(link.contains("Amazon Devices"))
			{
				element.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
