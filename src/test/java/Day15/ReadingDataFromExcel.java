package Day15;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Excel file ..> workbook...> sheet..>rows...>cell


public class ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {
        // Reading data from file
        FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\TestData\\test_data.xlsx");

        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet=workbook.getSheet("Sheet1");

        // Now find number of rows and columns
        int totalRows=sheet.getLastRowNum();
        int totalCell=sheet.getRow(0).getLastCellNum();
        System.out.println("Total rows:"+totalRows); //4 rows numbers are starting from 0
        System.out.println("Total cell:"+totalCell); //4 cell numbers are starting form 1

        for(int r=0; r<=totalRows; r++)
        {
            XSSFRow currentRow= sheet.getRow(r);

            for (int c=0; c<totalCell; c++) // as per java cell count starts from 0
            {
               XSSFCell cell= currentRow.getCell(c);
              System.out.print(cell.toString()+"\t");


            }
            System.out.println();
        }
        workbook.close();
        file.close();


    }
}
