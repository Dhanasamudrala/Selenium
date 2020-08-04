package seleniumDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {

	public static void main(String[] args) {
	try {
		FileInputStream fis=new FileInputStream("F:\\data.xlsx");
	    Workbook w=WorkbookFactory.create(fis);
		Sheet sh=w.getSheet("sheet1");
	    Row row=sh.createRow(6);
	    Cell cell=row.createCell(5);
	    cell.setCellValue("dhanu");
	    FileOutputStream fio=new FileOutputStream("F:\\data.xlsx");
	    w.write(fio);
	    System.out.println("RUN");
	    fio.close();
	    fis.close();}
	    catch (Exception e) {
	    System.out.println("file not found");
	    e.printStackTrace();
	    System.out.println(e);
	      
	    }
	}
}
	
	

