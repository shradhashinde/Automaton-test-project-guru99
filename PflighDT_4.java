//1.Launch browser
// Flights

package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PflighDT_4 
{
	public static void main(String[] args) throws InterruptedException
	{
		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver();  
		 
		  w.get("https://demo.guru99.com/test/newtours/index.php");
		
// Flights
			Thread.sleep(200);

				w.findElement(By.linkText("Flights")).click();

		          //4.click road trip by xpath
		 	     w.findElement(By.xpath("html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")) ;
		 	  
				
//Passengers
				w.findElement(By.name("passCount")).click();
				Select s1 = new Select(w.findElement(By.name("passCount")));
				s1.selectByValue("2");
			
//Departing From		
				w.findElement(By.name("fromPort")).click();
				Select s2 = new Select(w.findElement(By.name("fromPort")));
				s2.selectByValue("Paris");
				System.out.println("Click Departing sucessful");
	    
//On
				w.findElement(By.name("fromMonth")).click();
				Select s3 = new Select(w.findElement(By.name("fromMonth")));
				s3.selectByVisibleText("March");
				Thread.sleep(200);
//fromDay
				w.findElement(By.name("fromDay")).click();
				Select s4 = new Select(w.findElement(By.name("fromDay")));
				s4.selectByValue("6");

//Arriving In
				w.findElement(By.name("toPort")).click();
				Select s5 = new Select(w.findElement(By.name("toPort")));
				s5.selectByValue("3");
				
//Returning
				w.findElement(By.xpath("//tbody/tr[7]/td[2]/select[1]")).click();
				Select s6 = new Select(w.findElement(By.xpath("//tbody/tr[7]/td[2]/select[1]")));
				s6.selectByVisibleText("November");

//toDay
				w.findElement(By.name("toDay")).click();
				Select s7 = new Select(w.findElement(By.name("toDay")));
				s7.selectByValue("29");

				w.findElement(By.xpath("//tbody/tr[9]/td[2]/font[1]/font[1]/input[2]")).click();
//Airline
				w.findElement(By.name("airline")).click();
				Select s8 = new Select(w.findElement(By.name("airline")));
				s8.selectByVisibleText("Pangea Airlines");
//Countinue
				w.findElement(By.name("findFlights")).click();
				Thread.sleep(500);


	}

}
