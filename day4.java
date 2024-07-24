package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebloginHomeloan() {
		System.out.println("Weblogin home loan");
	}
	
	
	@Test(groups= {"smoke"})
	public void mobileloginHomeloan() {
		System.out.println("mobilelogin home loan");
	}
	@AfterMethod
	public void afmethod() {
		System.out.println("after every method iam executing");
	}
	@Parameters({"URL"})
	@Test
	public void apiloginHomeloan(String hh) {
		System.out.println("api login homeloan");
		System.out.println(hh);
	}

}
