package Day15;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingDynamicDataIntoExcel {
    public static void main(String[] args) throws IOException {

        // Excel file ..> workbook...> sheet..>rows...>cell

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\mydynamic.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();  // created workbook
        XSSFSheet sheet = workbook.createSheet("Datadynamic");  // created sheet

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int noOfRows=sc.nextInt();

        System.out.println("Enter number of cells");
        int noOfCells=sc.nextInt();

        for (int r=0; r<=noOfRows; r++)
        {
            XSSFRow currentRow=sheet.createRow(r);
            for (int c=0; c<noOfCells; c++)
            {
                XSSFCell cell=currentRow.createCell(c);
                cell.setCellValue(sc.next());
            }
        }

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File created");

    }
}
