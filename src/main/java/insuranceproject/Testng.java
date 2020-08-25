package insuranceproject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testng {


		
		
	@BeforeSuite
		public void test1() {
		System.out.println("Beforesuite");

					
		}
	@BeforeClass
	public void test2() {
		System.out.println("BeforeClass");
		
			
			
	}
	@BeforeMethod
	public void test3() {
		
		System.out.println("beforemethod");

		
	}
	@BeforeTest
	public void test4() {
		System.out.println("beforetest");
	}

	@Test
	public void test5() {
		System.out.println("test");

	}
	@AfterMethod
	public void test6() {
		System.out.println("AfterMethod");

	}
	@AfterClass
	public void test7() {
		System.out.println("Afterclass");

	}

	@AfterTest
	public void test8() {
		System.out.println("Aftertest");
		
	}
	@Test
	public void test9() {
		System.out.println("test");

	}
	}