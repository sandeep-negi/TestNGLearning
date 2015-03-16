package myPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics 
{
	@BeforeSuite
	public void s1()
	{
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void s2()
	{
		System.out.println("Before Test");
	}
	@BeforeGroups
	public void s3()
	{
		System.out.println("Before Groups");
	}
	@BeforeClass
	public void s4()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void s5()
	{
		System.out.println("Before Method");
	}
	@Test
	public void s6()
	{
		System.out.println("Test");
	}
	@AfterMethod
	public void s7()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void s8()
	{
		System.out.println("After Class");
	}
	@AfterGroups
	public void s9()
	{
		System.out.println("After Groups");
	}
	@AfterTest
	public void s10()
	{
		System.out.println("After Test");
	}
	@AfterSuite
	public void s11()
	{
		System.out.println("After Suite");
	}
	

}
