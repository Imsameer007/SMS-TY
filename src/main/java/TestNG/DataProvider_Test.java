package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SMS.genericutils.Excelutility;
import com.SMS.genericutils.IpathConstants;

public class DataProvider_Test {
	@Test(dataProvider = "datafromExcel")
	public void getData(String brand,String price,String size) {
		System.out.println(brand+" "+price+" "+size);
	}
//	@Test(dataProvider = "tv")
//	public void exceuteMethod(String product,int price,String size) {
//	
//		System.out.println(product+" "+price+" "+size);
//	}
//@DataProvider
//public Object[][] Mobile()
//{
//	Object[][] obj=new Object[2][2];
//			obj[0][0]="Samasung";
//			obj[0][1]=5000;
//			return obj;
//			
//}
//@DataProvider
//public Object[][]tv()
//{
//	Object[][] obj=new Object[2][3];
//	obj[0][0]="LG";
//	obj[0][1]=50000;
//	obj[0][2]="45 inch";
//	
//	obj[1][0]="Sony Bravia";
//	obj[1][1]=80000;
//	obj[1][2]="43 inch";
//	
//	return obj;
//}
//@DataProvider
//public Object[][] getDataFromExcel() throws Throwable {
//	FileInputStream fis=new FileInputStream(IpathConstants.excelPath);
//	Workbook wb = WorkbookFactory.create(fis);
//	Sheet sh = wb.getSheet("Sheet3");
//	int lastrow = sh.getLastRowNum();
//	int lastcell = sh.getRow(0).getLastCellNum();
//	
//	Object[][] obj = new Object[lastrow+1][lastcell];
//	for(int i=0;i<=lastrow;i++) {
//		for(int j=0;j<lastcell;j++) {
//			obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
//		}
//	}
//	return obj;

@DataProvider
public Object[][] datafromExcel() throws Throwable, IOException, Throwable
{
	Excelutility elib=new Excelutility();
	Object[][] value = elib.getMultiplesetofData("Sheet3");
	return value;
}

}

