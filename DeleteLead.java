package week6.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends LeadsBaseClass{

	@Test
	public void deleteLead() throws InterruptedException {
		// TODO Auto-generated method stub

		//5. Click on Leads Button
				//linktext->Leads
				
		driver.findElement(By.linkText("Leads")).click();

		
		//* 7	Click Find leads- linkText->Find Leads

		driver.findElement(By.linkText("Find Leads")).click();

		//8	Click on Phone ->//span[text()='Phone']

		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		//9	Enter phone number->name-phoneCountryCode,phoneAreaCode,phoneNumber

		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");

		driver.findElement(By.name("phoneAreaCode")).clear();
		driver.findElement(By.name("phoneAreaCode")).sendKeys("044");

		driver.findElement(By.name("phoneNumber")).clear();
		driver.findElement(By.name("phoneNumber")).sendKeys("7339313604");

		//10	Click find leads button->//button[text()='Find Leads']

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		//11	Capture lead ID of First Resulting lead-(//a[@class='linktext'])[4] or (//table[@class='x-grid3-row-table'])[1]/tbody/tr/td/div/a[1]

		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("Captured Lead ID :"+leadID);


		//12	Click First Resulting lead
		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();

		//13	Click Delete- //a[text()='Delete']

		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		//14	Click Find leads - //a[text()='Find Leads']
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		//15	Enter captured lead ID-//input[@name='id']
		driver.findElement(By.name("id")).sendKeys(leadID);

		//16	Click find leads button - //button[text()='Find Leads']
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		////div[@class='x-paging-info']

		Thread.sleep(2000);

		String recordText = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println("Verified message is : "+recordText);
		
	

	}

}
