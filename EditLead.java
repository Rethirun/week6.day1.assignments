package week6.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends LeadsBaseClass {

	
	@Test(invocationCount = 2,invocationTimeOut = 30)
	public void editLead() throws InterruptedException {
		// TODO Auto-generated method stub
		//5. Click on Leads Button
		//linktext->Leads
		
		driver.findElement(By.linkText("Leads")).click();

		
		
		//* 7	Click Find leads- linkText->Find Leads

		driver.findElement(By.linkText("Find Leads")).click();

		//* 8	Enter first name- (//div[@class='x-form-element'])[3]/following::input[@name='firstName'][2]

		driver.findElement(By.xpath("(//div[@class='x-form-element'])[3]/following::input[@name='firstName'][2]")).sendKeys("Revathi");

		//* 9	Click Find leads button- //button[text()='Find Leads']

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		System.out.println("Clicked");

		//* 10 Click on first resulting lead - (//a[@class='linktext'])[4]

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]/tbody/tr/td/div/a[1]")).click();

		//* 11 Verify title of the page

		String title=driver.getTitle();
		if(title.contains("View Lead")) {
			System.out.println("Title of the page is verified "+title);
		}

		//* 12 Click Edit - //a[text()='Edit']

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		//* 13 Change the company name - id ->updateLeadForm_companyName
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf2.0");

		//* 14 Click Update - class->smallSubmit
		driver.findElement(By.className("smallSubmit")).click();

		//* 15 Confirm the changed name appears- id ->viewLead_companyName_sp

		String updatedCmpnyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		if(updatedCmpnyName.contains("TestLeaf2.0")) {
			System.out.println("Changed Name appeared correctly "+updatedCmpnyName);
		}


	}

}
