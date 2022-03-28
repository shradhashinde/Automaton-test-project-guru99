package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class PregDT_1 
{

	public static void main(String[] args) 
	{
				 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		         WebDriver w = new FirefoxDriver();
		       
		         w.get("https://demo.guru99.com/test/newtours/index.php");
		         
		         
			//1.click on register link
		   
		         w.findElement(By.linkText("REGISTER")).click();
		  
		      //2.Enter valid Usernam
			  w.findElement(By.name("firstName")).sendKeys("shradha"); 
		        w.findElement(By.name("lastName")).sendKeys("shinde");
		  	   w.findElement(By.name("phone")).sendKeys("8208944593");
		  	   w.findElement(By.name("userName")).sendKeys("shradha4000@gmail.com");
		  	   w.findElement(By.name("address1")).sendKeys("ram nagar");
		  	   w.findElement(By.name("city")).sendKeys("Nanded");
		  	   w.findElement(By.name("state")).sendKeys("Maharashtra");
		  	   w.findElement(By.name("postalCode")).sendKeys("431605");
		  	  w.findElement(By.name("country")).click();
			Select s = new Select(w.findElement(By.name("country")));
			s.selectByValue("INDIA");
			w.findElement(By.name("email")).sendKeys("shradha4000@gmail.com");
			w.findElement(By.name("password")).sendKeys("ABC123");
			w.findElement(By.name("confirmPassword")).sendKeys("ABC123");
			w.findElement(By.name("submit")).click();

			System.out.println("Register sucessful");
		 
		  	
	}

}
