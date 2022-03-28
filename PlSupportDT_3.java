//1.Launch browser
 //2.webside    
// sign off
// support click
// contact us
// Home


package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PlSupportDT_3 
{

	public static void main(String[] args)
	{
		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver();  
			
		  //2.webside         
		   w.get("https://demo.guru99.com/test/newtours/index.php");
		 //enter user name,password and click on submit
			w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Test");
			w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("test");
			w.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]/input[1]")).click();
			System.out.println("Login sucessful");

		// sign off
		w.findElement(By.linkText("SIGN-OFF")).click();
		System.out.println("SIGN-OFF sucessful");
            
		w.navigate().back();
	    w.navigate().refresh();

		// support click
		w.findElement(By.linkText("SUPPORT")).click();
		w.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/a[1]/img[1]")).click();
		System.out.println("SUPPORT successful");
		w.navigate().back();
		  w.navigate().refresh();

		// contact us
		w.findElement(By.linkText("CONTACT")).click();
		w.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]"));
		System.out.println("Contact successful");
		w.navigate().back();
		  w.navigate().refresh();

		// Home
		w.findElement(By.linkText("Home")).click();
		System.out.println("open Home successful");
		w.navigate().back();
		w.navigate().refresh();


	}

}
