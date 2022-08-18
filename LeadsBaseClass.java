package week6.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadsBaseClass {
	
	ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void setup(String url,String username,String password) {
		
		WebDriverManager.chromedriver().setup();//Verify the version,download and set the chrome driver
		
		driver=new ChromeDriver();//Launch the chrome browser
		
		driver.get(url);//load the URL
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();//maximize the browser
		
		//2. Enter Username and Password Using id locator
		//id->username,password
		//Demosalesmanager
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		//3. Click on Login button using Class Locator
		//classname->decorativeSubmit
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//4. Click on CRM/SFA Link
		//linktext->CRM/SFA
		
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		
		driver.close();
	}

}
