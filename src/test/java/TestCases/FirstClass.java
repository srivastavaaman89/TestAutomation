package TestCases;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class readxlsdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		readxlsdata re=new readxlsdata();
		re.getdata("login34");
		
	}
	@DataProvider(name="bvtdata")
		public String[][] getdata(String excelsheet) throws EncryptedDocumentException, IOException
		{
		
			File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sheetName=wb.getSheet(excelsheet);
			
			int totalRows=sheetName.getLastRowNum();
			System.out.println(totalRows);
			Row rowcells=sheetName.getRow(0);
			int totalCol=rowcells.getLastCellNum();
			System.out.println(totalCol);
			readxlsdata re1=new readxlsdata();
			
			String testdata[][]=new String[totalRows][totalCol];
			DataFormatter format=new DataFormatter();
			for(int i=1;i<=totalRows;i++) {
				for(int j=0;j<totalCol;j++) {
					testdata[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));
					re1.login(testdata[i-1][j]);
					
				}
			}
			return testdata;
		}
}

	



