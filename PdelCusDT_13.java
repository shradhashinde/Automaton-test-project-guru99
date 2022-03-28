package DemoprojeFin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PdelCusDT_13
{

	public static void main(String[] args) throws InterruptedException 
	{


		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		  w.get("https://demo.guru99.com/test/newtours/index.php");
		
		// SELENIUM = delete customer form
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Delete Customer Form")).click();
		//Customer ID
		w.findElement(By.name("cusid")).sendKeys("xyz");
		//w.findElement(By.xpath("///html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("1");
		w.findElement(By.name("submit")).click();
		///html/body/form/table/tbody/tr[2]/td[2]/input
		//w.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		Alert alert = w.switchTo().alert();
		alert.accept();
		w.findElement(By.xpath("/html/body/form")).click();
		//System.out.println("delete customer form successful");
	  //  w.navigate().refresh();
		//w.navigate().back();

	}

}
