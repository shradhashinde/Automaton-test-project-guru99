//Launch browser
// Hotels
// Car Rentals
// Cruises
// VacationsDestinations

package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pallclick_5 
{

	public static void main(String[] args) 
	{
		
//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		
		  w.get("https://demo.guru99.com/test/newtours/index.php");
			
// Hotels
				w.findElement(By.linkText("Hotels")).click();
				System.out.println("Hotels click successful");
				w.navigate().back();
			    w.navigate().refresh();

// Car Rentals
				w.findElement(By.linkText("Car Rentals")).click();
				System.out.println("Car Rentals click successful");
				w.navigate().back();
			    w.navigate().refresh();


// Cruises
				w.findElement(By.linkText("Cruises")).click();
				System.out.println("Cruises click successful");
				w.navigate().back();
			    w.navigate().refresh();

			
// VacationsDestinations
				
			    w.findElement(By.linkText("Vacations")).click();
				System.out.println("Vacations click successful");
				w.navigate().back();
			    w.navigate().refresh();




	}

	
	}


