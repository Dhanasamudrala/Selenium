package seleniumDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadDemo {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fis=new FileInputStream("F:\\\\data.xlsx");
	
	Workbook W=WorkbookFactory.create(fis);
    org.apache.poi.ss.usermodel.Sheet sh=W.getSheet("sheet1");
    Row firstrow=sh.getRow(0);
    int rowcount=sh.getPhysicalNumberOfRows();
    for (int i = 0; i < rowcount; i++) {
    	for (int j = 0; j < firstrow.getFirstCellNum(); j++) {
    		Cell cl= (Cell) sh.getRow(i).getCell(j);
    		System.out.print(cl +"");
    	}
    	System.out.println();
			
		}
    	
		
	}


    
    
}
