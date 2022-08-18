package week6.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends LeadsBaseClass {

	
	@Test
	public void duplicateLead() {
		// TODO Auto-generated method stub
		
		//5. Click on Leads Button
		//linktext->Leads
		
		driver.findElement(By.linkText("Leads")).click();

		
		//6. Click on Create Lead
		//linktext->Create Lead
		
		driver.findElement(By.linkText("Create Lead")).click();

		//7. Enter CompanyName Field using id Locator
		//id->createLeadForm_companyName
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//8. Enter FirstName field using id locator
		//id->createLeadForm_firstName
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathi");

		//9. Enter LastName Field using id Locator
		//id->createLeadForm_lastName
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiru");

		//10.Enter FirstName (Local) field using id locator
		//id->createLeadForm_firstNameLocal
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Reva");

		//11. Enter Department Field using any Locator of your choice
		//id->createLeadForm_departmentName
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

		//12. Enter Description Field using any Locator of your choice
		//id->createLeadForm_description
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation");

		//13. Enter your email in the E-mail address field using locator of your choice
		//id->createLeadForm_primaryEmail
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revathi.cse2011@gmail.com");

		//14. Select the State/Province as NewYork using Visible Text
		//id->createLeadForm_generalStateProvinceGeoId
		
		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(stateDropdown);
		select.selectByVisibleText("New York");

		//15. Click on Create button
		//class->smallSubmit
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//16. Get the Title of Resulting Page using driver.getTitle() 
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//17. Click on Duplicate button -> Linktext->Duplicate Lead
		
		driver.findElement(By.linkText("Duplicate Lead")).click();

		//18. Clear the companyName field using .clear() and enter the new compnay name->id->createLeadForm_companyName
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NewOne");

		//19. Clear the FirstName field using .clear() and enter new first name->id-> createLeadForm_firstName
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Newname");
		
		//20. Click on CreateLead button->Classname->smallSubmit
		
		driver.findElement(By.className("smallSubmit")).click();

		//21. Get the title of resulting page using driver.getTitle()
		
		System.out.println(driver.getTitle());
		

	}

}
