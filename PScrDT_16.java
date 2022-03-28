package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PScrDT_16 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		  w.get("https://demo.guru99.com/test/newtours/index.php");
		

		//scroll bar
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Scrollbar Demo")).click();
		
		JavascriptExecutor ex = (JavascriptExecutor)w;
		//ex.executeScript("arguments[0].scrollIntoView();",w.findElement(By.xpath("VBScript"))); 
	//	System.out.println("Scroll bar click successful");
	   ///html/body/div[4]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[6]/div/div/div/div/div[1]/div/div/h4/a

		// w.findElement(By.linkText("VBScript") find the last element
		Thread.sleep(2000);
		ex.executeScript("arguments[0].scrollIntoView();",w.findElement(By.linkText("SAP MM")));
		w.navigate().back();
	   
	}

}
