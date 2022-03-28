package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pyahoo_21 {

	public static void main(String[] args) throws InterruptedException {
		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		
		  w.get("https://demo.guru99.com/test/newtours/index.php");
			
		
		// SELENIUM = yahoo
				Thread.sleep(2000);
				
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
				w.findElement(By.linkText("Yahoo")).click();
				Thread.sleep(2000);
				w.navigate().back();

				// selenium = tooltip
				Thread.sleep(2000);
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
				w.findElement(By.linkText("Tooltip")).click();
				System.out.println( "tooltip click successful");
			   
				
				w.navigate().back();

				// selenium = file upload
				Thread.sleep(2000);
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
				w.findElement(By.linkText("File Upload")).click();
				Thread.sleep(2000);
				w.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\dell\\Desktop\\shradha resume.docx");
				w.findElement(By.id("terms")).click();
				w.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
				System.out.println( "file upload click successful");
				   
				w.navigate().back();
		

	}

}
