package com.SMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teacher_Page_Test {
@FindBy(xpath=" //a[text()=' Add Teacher']")
private WebElement addteacher;

public void TeacherPage_Test(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
