package DemoprojeFin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PloginDT_2
{
	public static void main(String[] args) 
	{
       //1.Launch browser
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
	  WebDriver w = new FirefoxDriver();  
		
	  //2.webside         
	   w.get("https://demo.guru99.com/test/newtours/index.php");
	   
	   // 3.login page
	    if(w.getTitle().equals("Welcome: Mercury Tours"))
	{

	//enter user name,password and click on submit
	w.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Test");
	w.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("test");
	w.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]/input[1]")).click();
	System.out.println("Login sucessful");
	}

	else
	{
	System.out.println("Login unsucessful");
	}

	System.out.println(w.getTitle());

	if(w.getTitle().equals("Login: Mercury Tours")) 
	{

	w.findElement(By.linkText("SIGN-OFF")).click(); //click on sign off
	System.out.println("Signed off successful");//print sign off successful
	}
	else
	{
	System.out.println("Signoff unsucessful");
	}
	w.navigate().back();
    w.navigate().refresh();

}   
    
}


