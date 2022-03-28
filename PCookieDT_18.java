package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PCookieDT_18 {

	public static void main(String[] args) throws InterruptedException
	{
				//1.Launch browser
				 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
				  WebDriver w = new FirefoxDriver(); 
				  w.get("https://demo.guru99.com/test/newtours/index.php");
				
		// selenium = cookie handling demo
				Thread.sleep(2000);
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
				w.findElement(By.linkText("Cookie Handling Demo")).click();
				w.findElement(By.xpath("/html/body/div[2]/form/input[1]")).sendKeys("shradha4000@gmail.com");
				w.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("test");
				w.findElement(By.xpath("/html/body/div[2]/form/button")).click();
				System.out.println("cookie handling demo click successful");
			    w.navigate().refresh();
				w.navigate().back();


	}

}
