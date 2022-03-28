// Insurance Project
// Register	
//1.Launch browser
 //sign up as a new user
// Register
//Date of birth
//Licence Period
//Occupation
//Address Street
//City
//County
//Post code
//Email
//Password
//Confirm password

package DemoprojeFin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PInsurPriDT_6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//1.Launch browser
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
		  WebDriver w = new FirefoxDriver(); 
		  
		  w.get("https://demo.guru99.com/test/newtours/index.php");
		  
			
// Register
			w.findElement(By.linkText("Insurance Project")).click();
			w.findElement(By.xpath("/html/body/div[3]/a")).click();

		Thread.sleep(200);
 //sign up as a new user
		w.findElement(By.id("user_title")).click();
		Select list = new Select(w.findElement(By.id("user_title")));
		list.selectByIndex(3);

		w.findElement(By.id("user_firstname")).sendKeys("SHRADHA");
		w.findElement(By.id("user_surname")).sendKeys("BAPURAO");
		w.findElement(By.id("user_phone")).sendKeys("820944593");
		
//Date of birth
		w.findElement(By.id("user_dateofbirth_1i")).click();
		Select dob = new Select(w.findElement(By.id("user_dateofbirth_1i")));
		dob.selectByValue("1947");

		w.findElement(By.id("user_dateofbirth_2i")).click();
		Select frstdrop = new Select(w.findElement(By.id("user_dateofbirth_2i")));
		frstdrop.selectByIndex(5);

		w.findElement(By.id("user_dateofbirth_3i")).click();
		Select snddrop = new Select(w.findElement(By.id("user_dateofbirth_3i")));
		snddrop.selectByValue("18");

		w.findElement(By.xpath("//*[@id=\"new_user\"]/div[2]/div[4]/label[2]")).click();
		
//Licence Period
		w.findElement(By.id("user_licenceperiod")).click();
		Select t = new Select(w.findElement(By.id("user_licenceperiod")));
		t.selectByIndex(2);
		
//Occupation
          w.findElement(By.id("user_occupation_id")).click();
		Select id = new Select(w.findElement(By.id("user_occupation_id")));
		id.selectByIndex(2);
        
//Address Street
		w.findElement(By.id("user_address_attributes_street")).sendKeys("RAMAGAR");
		
//City
		w.findElement(By.id("user_address_attributes_city")).sendKeys("pune");
		
//County
		w.findElement(By.id("user_address_attributes_county")).sendKeys("india");
		
//postcode
		w.findElement(By.id("user_address_attributes_postcode")).sendKeys("412001");
		
//email
		w.findElement(By.id("user_user_detail_attributes_email")).sendKeys("shradha4000@gmail.com");
		
		
//password
		w.findElement(By.id("user_user_detail_attributes_password")).sendKeys("test");
		
//password_confirmation
		w.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("test");
		w.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/input[2]")).click();
		
		w.navigate().back();
	    w.navigate().refresh();
	    
// Register
	 			w.findElement(By.linkText("Insurance Project")).click();
	 			w.findElement(By.xpath("/html/body/div[3]/a")).click();

// Insurance login
	 			
	 						w.findElement(By.id("email")).sendKeys("shradha4000@gmail.com");
	 						w.findElement(By.id("password")).sendKeys("test");
	 						w.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).click();
	 						System.out.println("login successful");
	 					    w.navigate().refresh();

	}

}
