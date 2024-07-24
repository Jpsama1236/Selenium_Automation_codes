package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"URL"})
	@Test
	public void ploan(String hh) {
		System.out.println("good");
		System.out.println(hh);
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("before test starting iam executing");
	}
	
	@AfterSuite
	public void af() {
		System.out.println("iam executing aftersuite");
	}
}
