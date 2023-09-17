package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation_Test {

	@BeforeSuite
	public void configBS() {
		System.out.println("connect to DB");
	}
	@BeforeClass
	public void configBC() {
		System.out.println("launch the browser");
	}
	@BeforeMethod
	public void configBM() {
		System.out.println("login to the application");
	}

	@Test
	public void executeTest() {
		System.out.println("exceute actual testscript");
	}
	@AfterMethod
	public void configAM() {
		System.out.println("logout the application");
	}
	@AfterClass
	public void configAC() {
		System.out.println("close the browser ");
	}
	@AfterSuite
	public void configAS() {
		System.out.println("disconnect from Database");
	}
	@Test
	public void actual() {
		System.out.println("exceutetest3");
	}
	}

