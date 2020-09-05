package microsoftOfficeCollections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	FileInputStream fis = new FileInputStream("C:\\Users\\GIRISH\\Desktop\\Employee_Info.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet ws = wb.createSheet("Company Detail");
	Map<String,Object[]>data= new TreeMap<String,Object[]>();
	data.put("0",new Object[] {"SL", "COMPANY", "HEAD-QUATERS ADDRESS","MARKET VALUE"});
	data.put("1",new Object[] {"1" ,"Google", "California,USA","$131,133,000,000"});
	data.put("2",new Object[] {"2" ,"Microsoft", "Washington,USA","$286,000,000,000"});
	data.put("3",new Object[] {"3" ,"Infosys", "ADDRESS","MARKET VALUE"});
	data.put("4",new Object[] {"4" ,"Cognizant", "ADDRESS","MARKET VALUE"});
	data.put("5",new Object[] {"5" ,"TCS", "ADDRESS","MARKET VALUE"});
	data.put("6",new Object[] {"6" ,"Tech Mahindra", "ADDRESS","MARKET VALUE"});
	data.put("7",new Object[] {"7" ,"MindTree", "ADDRESS","MARKET VALUE"});
	data.put("8",new Object[] {"8" ,"HoneyWell", "ADDRESS","MARKET VALUE"});
	data.put("9",new Object[] {"9" ,"Rockwell", "ADDRESS","MARKET VALUE"});
	data.put("10",new Object[]{"10" ,"Horizon","ADDRESS","MARKET VALUE"});
	Set <String>keyset=data.keySet();
	int rownum = 0;
	for(String key:keyset)
	{
	/*for(int i=0;i<keyset.size();i++)
		 {
			String key= keyset[i];*/
			Row row=ws.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum=0;
			for(Object obj:objArr)
			{
			/*for(int j=0;j<objArr.length;j++)
				{
					Object obj =objArr[j];*/
					Cell cell = row.createCell(cellnum++);
					if(obj instanceof String)
					cell.setCellValue((String)obj);
					else if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);		
				}
		 }
	FileOutputStream fos = new FileOutputStream("C:\\Users\\GIRISH\\Desktop\\Employee_Info.xlsx");
	wb.write(fos);
	System.out.println("Data is Written");
	
	}

}
