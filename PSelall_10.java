package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class PSelall_10
{
	public static void main(String[] args) throws InterruptedException 
	{

		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		  
		  w.get("https://demo.guru99.com/test/newtours/index.php");
		  
			// selenium = flashmovie demo
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			System.out.println("flashmovie click successful");
		    w.navigate().refresh();

			

			// selenium = radio and checkbox demo
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[2]/a")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-7-1\"]")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-7-3\"]")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-6-0\"]")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-6-1\"]")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-6-2\"]")).click();
			w.navigate().back();
			System.out.println("radio and checkbox click successful");
		    w.navigate().refresh();
			}

}
