package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PselOutB_14 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		  w.get("https://demo.guru99.com/test/newtours/index.php");
	
		  // Selenium = inside outside box textbox
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("Inside & Outside Block Level Tag")).click();
			//w.findElement(By.xpath("/html/body/p/a")).click();
			// w.findElement(By.xpath("/html/body/a/div/span")).click();
             System.out.println("inside outside box textbox click  sucessful");
			w.navigate().back();
		


	}

}
