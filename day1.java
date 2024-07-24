package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void last() {
		System.out.println("i will execute last");
	}
	
	@Test(groups= {"smoke"})
	public void demo() {
		System.out.println("hello");
	}

	
	@Test
	public void demo2() {
		System.out.println("bye");
	}
}
