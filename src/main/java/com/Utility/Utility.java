package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Base.Base;

public class Utility extends Base {
	public static void Implicitlywait()
	 {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
	 }
	public static XSSFSheet getsheet(String sheetname) throws IOException
	{
		FileInputStream fis = new FileInputStream(projectpath+"C:\\Users\\Dell\\Desktop.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet(sheetname);
		
		return sheet;
	}
	
	public static Object getSingleData(int rownum, int cellnum, XSSFSheet sheet)
	{
	     if(sheet.getRow(rownum).getCell(cellnum).getCellType().toString().equalsIgnoreCase("string"))
	     {
	      sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
	      
	     }
	     else {
	    	 sheet.getRow(rownum).getCell(cellnum).getNumericCellValue();
	     }
	     return sheet;
	}
}
	/*public static Sheet getsheet(String sheetname) throws IOException
	{
		FileInputStream fileinputstream = new FileInputStream("C:\\Users\\Dell\\Desktop.xlsx");
		
	//	Sheet sh=WorkbookFactory.create(fileinputstream).getSheet(sheetname);
		//return sh;
	}
	
	public static void getSingleData(int rowNum,int cellNum,Sheet sh)
	{
		if(sh.getRow(rowNum).getCell(cellNum).getCellType().toString().equalsIgnoreCase("string"))
			sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
		else
			sh.getRow(rowNum).getCell(cellNum).getNumericCellValue();
			
	}
	

	public static void getAllData(String sheetname) throws IOException
	{
		
FileInputStream fileinputstream = new FileInputStream(projectpath+"\\src\\main\\resources\\Exeldata\\OrangeHrmLogin.xlsx");
		
		Sheet sh=WorkbookFactory.create(fileinputstream).getSheet(sheetname);
		
		HashMap<String,String> map = new HashMap();
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			int cellNum = sh.getRow(i).getLastCellNum();
			
				String a=sh.getRow(i).getCell(0).getStringCellValue();
				String b=sh.getRow(i).getCell(1).getStringCellValue();
				
				map.put(a, b);
			
		}
		
		System.out.println(map);
		
          System.out.println(map.keySet());
          
          map.values();
          
        Iterator <Entry<String,String> > iterator= map.entrySet().iterator();
        
        while(iterator.hasNext())
        {
        	Map.Entry<String,String> ab=(Map.Entry<String, String>)iterator.next();
        	
        	System.out.println(ab.getKey()+" "+ab.getValue());
        }
	}
	 
	 
	 
	 public static  void WaitForVisibility( String e)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
		}
	  
	 public void AlertIsPresent()
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.alertIsPresent());
	 }
	 
	 
	 public static void main(String[] args) throws IOException 
	 {
		 getAllData("Login");
		 
		
	 }
	
		

	}*/


