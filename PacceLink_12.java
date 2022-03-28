package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PacceLink_12 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		  w.get("https://demo.guru99.com/test/newtours/index.php");
		  
		// accessing link`
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[4]/a")).click();
		//w.findElement(By.xpath("/html/body/a[1]")).click();
		System.out.println("accessing link click successful");
	    w.navigate().refresh();
		w.navigate().back();
	}

}
