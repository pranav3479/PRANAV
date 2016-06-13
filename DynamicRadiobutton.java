package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicRadiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.coolfields.co.uk/2011/04/accessible-forms-checkboxes-and-radio-buttons/");
		int count=driver.findElements(By.xpath("//input[@name='age']")).size();
		for(int i=0;i<count;i++)
		{
			String a=driver.findElements(By.xpath("//input[@name='age']")).get(i).getAttribute("id");
			if(a.equals("age1"))
			{
				driver.findElements(By.xpath("//input[@name='age']")).get(i).click();
			}
		}
		

	}

}
