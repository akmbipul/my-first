package fileReaderNWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelData {
	
	public static void main(String[] args) throws Exception {

	        File src = new File("/Users/akmaslam/Documents/StudyFolder/Frameworks/Team5WebAutomation/Facebook/src/main/read.xlsx");
	        FileInputStream fls = new FileInputStream(src);
	        HSSFWorkbook wb = new HSSFWorkbook(fls);
	        HSSFSheet sheet1 = wb.getSheetAt(0);
	        HSSFCell data0 = sheet1.getRow(0).getCell(0);
	        System.out.println(data0);

	    
	}

}
