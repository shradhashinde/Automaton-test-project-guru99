package DemoprojeFin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Aprinone9 {

	public static void main(String[] args)
	{
//1.Launch browser
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium jar\\geckodriver.exe");
     WebDriver w = new FirefoxDriver(); 
		
    w.get("https://demo.guru99.com/test/newtours/index.php");
			
// Insurance login
			w.findElement(By.id("email")).sendKeys("shradha4000@gmail.com");
			w.findElement(By.id("password")).sendKeys("test");
			w.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).click();

			// edit profie
			w.findElement(By.linkText("Edit Profile")).click();

			w.findElement(By.id("user_title")).click();
			Select title = new Select(w.findElement(By.id("user_title")));
			title.selectByIndex(3);

			w.findElement(By.id("user_firstname")).sendKeys("shradha");
			w.findElement(By.id("user_surname")).sendKeys("shinde");
			w.findElement(By.id("user_phone")).sendKeys("8208944593");
			w.findElement(By.id("user_dateofbirth_1i")).click();
			Select DOB = new Select(w.findElement(By.id("user_dateofbirth_1i")));
			DOB.selectByValue("1947");

			w.findElement(By.id("user_dateofbirth_2i")).click();
			Select DOB1 = new Select(w.findElement(By.id("user_dateofbirth_2i")));
			DOB1.selectByIndex(5);

			w.findElement(By.id("user_dateofbirth_3i")).click();
			Select DOB2 = new Select(w.findElement(By.id("user_dateofbirth_3i")));
			DOB2.selectByValue("18");

			w.findElement(By.id("user_licenceperiod")).click();
			Select ul = new Select(w.findElement(By.id("user_licenceperiod")));
			ul.selectByIndex(2);

			w.findElement(By.id("user_occupation_id")).click();
			Select u_id = new Select(w.findElement(By.id("user_occupation_id")));
			u_id.selectByIndex(2);

			w.findElement(By.id("user_address_attributes_street")).sendKeys("Ramnagar");
			w.findElement(By.id("user_address_attributes_city")).sendKeys("pune");
			w.findElement(By.id("user_address_attributes_county")).sendKeys("india");
			w.findElement(By.id("user_address_attributes_postcode")).sendKeys("431605");

			w.findElement(By.xpath("//body/div[3]/div[1]/div[5]/form[1]/div[14]/input[1]")).click();

			// Insurance_Profile
			w.findElement(By.linkText("Profile")).click();

			// Insurance_request_quotation
			w.findElement(By.xpath("//a[@id='ui-id-2']")).click();

			w.findElement(By.id("quotation_breakdowncover")).click();
			Select bw = new Select(w.findElement(By.id("quotation_breakdowncover")));
			bw.selectByValue("3");

			w.findElement(By.xpath("//label[contains(text(),'YES')]")).click();

			w.findElement(By.name("incidents")).sendKeys("10");
			w.findElement(By.name("registration")).sendKeys("101");
			w.findElement(By.name("mileage")).sendKeys("8000");
			w.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("1000");

			w.findElement(By.id("quotation_vehicle_attributes_parkinglocation")).click();
			Select parkinglocation = new Select(w.findElement(By.id("quotation_vehicle_attributes_parkinglocation")));
			parkinglocation.selectByValue("Public place");

			w.findElement(By.name("year")).click();
			Select year = new Select(w.findElement(By.name("year")));
			year.selectByValue("2018");

			w.findElement(By.name("month")).click();
			Select month = new Select(w.findElement(By.name("month")));
			month.selectByValue("5");

			w.findElement(By.name("date")).click();
			Select date = new Select(w.findElement(By.name("date")));
			date.selectByValue("3");

			w.findElement(By.xpath("//body/div[3]/div[1]/div[2]/form[1]/div[8]/input[1]")).click();
			w.findElement(By.xpath("//body/div[3]/div[1]/div[2]/form[1]/div[8]/input[3]")).click();

			w.navigate().back();

			// Insurance logout
			w.findElement(By.xpath("/html/body/div[3]/form/input")).click();

			System.out.println("Demo tour site testing done");
		}

		public void selenium(WebDriver w) throws InterruptedException {
// selenium = flashmovie demo
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[1]/a")).click();
			Thread.sleep(2000);

// selenium = radio and checkbox demo
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[2]/a")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-7-1\"]")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-7-3\"]")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-6-0\"]")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-6-1\"]")).click();
			w.findElement(By.xpath("//*[@id=\"vfb-6-2\"]")).click();
			w.navigate().back();

// selenium = Table demo
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[3]/a")).click();
			w.navigate().back();

// accessing link
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[4]/a")).click();
			w.findElement(By.xpath("/html/body/a[1]")).click();
			w.navigate().back();

			// selenium = ajax demo
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[5]/a")).click();
			w.findElement(By.xpath("//*[@id=\"yes\"]")).click();
			w.findElement(By.xpath("//*[@id=\"buttoncheck\"]")).click();
			w.navigate().back();

			// Selenium = inside outside box textbox
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("Inside & Outside Block Level Tag")).click();
			w.findElement(By.xpath("/html/body/p/a")).click();
			w.navigate().back();
			// w.findElement(By.xpath("/html/body/a/div/span")).click();

			// SELENIUM = delete customer form
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("Delete Customer Form")).click();
			w.findElement(By.name("cusid")).sendKeys("1");
			w.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
			Alert alert = w.switchTo().alert();
			alert.accept();
			alert.accept();
			w.findElement(By.xpath("/html/body/form")).click();
			w.navigate().back();

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
			w.navigate().back();

			// selenium = file upload
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("File Upload")).click();
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("E:\\priti\\notes\\27-may.docx");
			w.findElement(By.id("terms")).click();
			w.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
			w.navigate().back();

			// selenium = login
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("Login")).click();
			w.findElement(By.id("email")).sendKeys("ashwinikusalkar1996@gmail.com");
			w.findElement(By.id("passwd")).sendKeys("12345");
			w.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
			w.navigate().back();

			// selenium = social icon
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("Social Icon")).click();
			w.navigate().back();

			// selenium = selenium auto it
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("Selenium Auto IT")).click();
			w.navigate().back();

			// selenium = selenium ide test
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("Selenium IDE Test")).click();
			w.findElement(By.id("email")).sendKeys("ashwinikusalkar1996@gmail.com");
			w.findElement(By.id("pass")).sendKeys("12345");
			w.findElement(By.id("u_0_b")).click();
			w.navigate().back();

			// selenium = demo99 demo page
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("Guru99 Demo Page")).click();
			w.navigate().back();
			
			//scroll bar
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("Scrollbar Demo")).click();
			
			JavascriptExecutor ex = (JavascriptExecutor)w;
			ex.executeScript("arguments[0].scrollIntoView();",w.findElement(By.linkText("VBScript")));  // w.findElement(By.linkText("VBScript") find the last element
			Thread.sleep(2000);
			ex.executeScript("arguments[0].scrollIntoView();",w.findElement(By.linkText("SAP MM")));
			w.navigate().back();

			// selenium = file upload using sikuli Demo
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("File Upload using Sikuli Demo")).click();
			w.findElement(By.xpath("//*[@id=\"photoimg\"]")).sendKeys("E://priti//Resume//priti_CV.pdf");
			w.navigate().back();

			// selenium = cookie handling demo
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("Cookie Handling Demo")).click();
			w.findElement(By.xpath("/html/body/div[2]/form/input[1]")).sendKeys("ashwinikusalkar1996@gmail.com");
			w.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("12345");
			w.findElement(By.xpath("/html/body/div[2]/form/button")).click();
			w.navigate().back();

			// DOB
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w.findElement(By.linkText("Selenium DatePicker Demo")).click();
			WebElement datetime = w.findElement(By.xpath("//body/form[1]/input[1]"));
			datetime.sendKeys("05/06/2021");
			datetime.sendKeys(Keys.TAB);
			datetime.sendKeys("0345AM");
			w.findElement(By.xpath("//body/form[1]/input[2]")).click();
			w.navigate().back();
			
					}
	}


