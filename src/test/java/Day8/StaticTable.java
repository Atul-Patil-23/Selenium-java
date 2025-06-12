package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Find total number of rows in table
        int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        //System.out.println("rows:"+rows);

        //Find total number of columns in table
        //int columns= driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
       // System.out.println("number of columns:"+columns);

        // Read data from specific row and column
        //String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        //System.out.println(bookName);

        // Read all the data from table

       // System.out.println("Bookname"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");

       /* for(int r=2; r<=rows; r++) {
            for (int c = 1; c <= columns; c++) {
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(value + "\t");
            }
            System.out.println();

        }*/
            // Print the book name whose author is Mukesh
          /*  for(int r=2; r<=rows;r++)
            {
                String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
                System.out.println(authorName);
                if(authorName.equals("Mukesh"))
                {
                    String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                    System.out.println(bookname+"\t"+authorName);
                }
            }
*/
        // Find the total price of all books
        int total=0;
        for(int r=2; r<=rows;r++) {
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
            System.out.println(price);
            total=total+Integer.parseInt(price);
        }
        System.out.println("Total price:"+total);






    }
}
