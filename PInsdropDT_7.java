package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PInsdropDT_7
{

	public static void main(String[] args) throws InterruptedException 
	{
		
//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		
		  w.get("https://demo.guru99.com/test/newtours/index.php");

// selenium = drag and drop action
					Thread.sleep(2000);
		//w.findElement(By.xpath("html/body/div[3]/div[2]/nav/div/div/ul/li[1]/ul/li[19]/a")).click();
					
w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[19]/a")).click();
System.out.println("click drag an drop sucessful");
				

	}

}
