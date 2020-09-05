package microsoftOfficeCollections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	File fil = new File ("C:\\Users\\GIRISH\\Desktop\\Employee_Info.xlsx");
	FileInputStream fis = new FileInputStream(fil);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet ws = wb.getSheetAt(0);
	Row row = ws.createRow(6);
	Cell cell = row.createCell(1);
	cell.setCellValue("Rakesh Mohanty");
	FileOutputStream fio = new FileOutputStream(fil);
	wb.write(fio);
	fio.close();
	System.out.println("Value is written in excel");
	System.out.println(ws.getRow(6).getCell(1));
	
	}

}
