package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PSellDOB_17 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		  w.get("https://demo.guru99.com/test/newtours/index.php");
		
		// DOB
				Thread.sleep(2000);
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
				w.findElement(By.linkText("Selenium DatePicker Demo")).click();
				WebElement datetime = w.findElement(By.xpath("//body/form[1]/input[1]"));
				datetime.sendKeys("05/06/2021");
				datetime.sendKeys(Keys.TAB);
				datetime.sendKeys("0345AM");
				w.findElement(By.xpath("//body/form[1]/input[2]")).click();
				w.navigate().back();
				
	}

}
