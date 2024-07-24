package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void bfclass() {
		System.out.println("before class");
	}
	@Parameters({"URL"})
	@Test()
	public void WebloginCarloan(String uname) {
		System.out.println("Weblogin car loan");
		System.out.println(uname);
	}
	@BeforeSuite
	public void bef() {
		System.out.println("before suit iam executing");
	}
	@BeforeMethod
	public void bfmethod() {
		System.out.println("before evry method i will execute");
	}
	
	@Test
	public void mobilelogincarloan() {
		System.out.println("mobile login car");
	}

	@Test(enabled=false)
	public void mobilelogincarloan2() {
		System.out.println("mobile login car2");
		
	}
	

	@Test(groups= {"smoke"})
	public void mobilelogincarloan3() {
		System.out.println("mobile login car3");
	}
	@Test(dependsOnMethods= {"mobilelogincarloan","WebloginCarloan"})
	public void apilogincarloan() {
		System.out.println("api login car");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class iam executing");
	}

}
