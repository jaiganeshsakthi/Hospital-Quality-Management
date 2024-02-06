package GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility
{
	public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\HQM\\src\\test\\resources\\file\\data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetname);
		Row r = sh.getRow(rownum);
		String data = r.getCell(cellnum).getStringCellValue();
		return data;
		
	}
	
	public int getRowCount(String sheetname) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IConstants.EXCEL_PATH);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetname);
		int lastrownum = sh.getLastRowNum();
		book.close();
		return lastrownum;
	}
	
	public void setDataToExcel(String sheetname,int rownum,int cellnum,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IConstants.EXCEL_PATH);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetname);
		Row r = sh.getRow(rownum);
		Cell c = r.createCell(cellnum);
		c.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(IConstants.EXCEL_PATH);
		book.write(fos);
		book.close();
	}
    
	

}
