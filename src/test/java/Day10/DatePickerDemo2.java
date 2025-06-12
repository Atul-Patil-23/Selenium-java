package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DatePickerDemo2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Expected data
        String year="2023";
        String month="June";
        String date="19";

        driver.findElement(By.xpath("//input[@id='txtDate']")).click();

        //select year
        WebElement yearDrp= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear=new Select(yearDrp);
        selectYear.selectByVisibleText(year);

    }
}
