package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static String getData(int row, int column) throws IOException {
        String value = "";
       
            FileInputStream fis = new FileInputStream("testdata/TestData.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            value = sheet.getRow(row).getCell(column).toString();
            workbook.close();
            fis.close();
      
        return value;
    }
}