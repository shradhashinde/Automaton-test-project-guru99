package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PselLog_15 {

	public static void main(String[] args) throws InterruptedException
	{
		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		  w.get("https://demo.guru99.com/test/newtours/index.php");
		

		// selenium = login
				Thread.sleep(2000);
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
				w.findElement(By.linkText("Login")).click();
				w.findElement(By.id("email")).sendKeys("shradha4000@gmail.com");
				w.findElement(By.id("passwd")).sendKeys("test");
				w.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
				w.navigate().back();

	}

}
