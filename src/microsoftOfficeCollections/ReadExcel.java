package microsoftOfficeCollections;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	FileInputStream fis=new FileInputStream("C:\\Users\\GIRISH\\Desktop\\Employee_Info.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet ws= wb.getSheetAt(0);
	Row row = ws.getRow(0);
	Cell cell= row.getCell(0);
	System.out.println(cell); 
	System.out.println(ws.getRow(1).getCell(1));
	System.out.println(ws.getRow(2).getCell(3));
	
	}

}
