package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PselPage_19 {

	public static void main(String[] args) throws InterruptedException 
	{
		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		  w.get("https://demo.guru99.com/test/newtours/index.php");
		

		// selenium = demo99 demo page
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		//*[@id="navbar-brand-centered"]
		
		Thread.sleep(2000);
		w.findElement(By.linkText("Guru99 Demo Page")).click();
		System.out.println("Click sucessful");
		Thread.sleep(2000);
		w.navigate().back();
		
		
		
	}

}
