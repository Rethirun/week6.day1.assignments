package week6.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead_Attr extends LeadsBaseClass {

	@Test(invocationCount = 2,timeOut = 13)
	public void createLead() {
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

		//primaryPhoneCountryCode,primaryPhoneAreaCode,primaryPhoneNumber
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");

		//driver.findElement(By.name("phoneAreaCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");

		//driver.findElement(By.name("phoneNumber")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7339313604");


		//13. Enter your email in the E-mail address field using locator of your choice
		//id->createLeadForm_primaryEmail

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revathi.cse2011@gmail.com");



		//14. Select the State/Province as NewYork using Visible Text
		//id->createLeadForm_generalStateProvinceGeoId

		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(stateDropdown);
		select.selectByVisibleText("Armed Forces Americas");

		//15. Click on Create button
		//class->smallSubmit

		driver.findElement(By.className("smallSubmit")).click();

		//16. Get the Title of Resulting Page using driver.getTitle() 
		String title = driver.getTitle();

		System.out.println(title);



	}

}
