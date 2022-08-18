package week6.day1.assignments;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class Priority {
	
	@Test(priority = -1)
	public void check() {
		System.out.println("I am inside check method");
	}
	
	@Test(priority=2)
	public void Bark() {
		System.out.println("I am inside Bark method");
	}
	
	@Test(priority = -3)
	public void dog() {
		System.out.println("I am inside dog method");
	}

}
