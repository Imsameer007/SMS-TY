package com.admin_Module;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SMS.ObjectRepository.Homepage;
import com.SMS.ObjectRepository.LP_Page;
import com.SMS.ObjectRepository.MyprofilePage;
import com.SMS.ObjectRepository.MyprofileUpdatePage;
import com.SMS.genericutils.Excelutility;
import com.SMS.genericutils.FileUtility;
import com.SMS.genericutils.JavaUtility;
import com.SMS.genericutils.WebdriverUtilities;

public class MyProfile_GenericUtil_POMTest {

	public static void main(String[] args) throws Throwable {
		//Creating object of every utility classes

		Excelutility elib=new Excelutility();
		FileUtility flib=new FileUtility();
		JavaUtility jlib=new JavaUtility();
		WebdriverUtilities wlib=new WebdriverUtilities();
		//fetching data from properties file

		WebDriver driver=new ChromeDriver();
		String Browser=flib.getPropertyKeyValue("browser");

		String URL=flib.getPropertyKeyValue("URL");
		String USERNAME=flib.getPropertyKeyValue("UN");
		String PASSWORD=flib.getPropertyKeyValue("pwd");
		//WebDriver driver=new ChromeDriver();
		wlib.maximizetheBrowser(driver);
		driver.get(URL);
		//	wlib.implicitlyWait(driver);
		LP_Page lp = new LP_Page(driver);
		lp.getEmailEdt().sendKeys(USERNAME);
		lp.getPwdEdt().sendKeys(PASSWORD);
		lp.getSubmitBtn().click();

		//	driver.findElement(By.xpath("//span[text()='My Profile']")).click();
		//	driver.findElement(By.id("btnEdit")).click();

		//click on my profilePage
		Homepage hp=new Homepage(driver);
		hp.ClickOnProfilePage();
		MyprofilePage mfp=new MyprofilePage(driver);
		mfp.Editpage();

		//enter the details 
		MyprofileUpdatePage mpu=new MyprofileUpdatePage();
		mpu.ProfileDetails(elib.getMultipleDataFromExcel("MyProfileDetails", 0, 1, driver, jlib),driver,elib.readExcelData("MyProfileDetails", 1, 3));
		driver.quit();

	}

}
