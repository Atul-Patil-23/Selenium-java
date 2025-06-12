package Day15;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WritingIntoSpecificRowAndColumn {
    public static void main(String[] args) throws IOException {
        //// Excel file ..> workbook...> sheet..>rows...>cell
        FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myrandomsheet.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();  // created workbook
        XSSFSheet sheet=workbook.createSheet("Datarandom");  // created sheet

      XSSFRow row=sheet.createRow(3);
       XSSFCell cell=row.createCell(4);

       cell.setCellValue("welcome");

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File created");


    }
}

