package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePicker {

    //select month & year
    static void selectMonthAndYear(WebDriver driver,String month, String year, String date) {
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (currentYear.equals(year) && currentMonth.equals(month)) {
                break;
            }
            // click on next CTA
            // if u want to select previous date, then add previous cta xpath and click
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }

        //select date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }

    }



    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // switch to frame
        driver.switchTo().frame(0);

        // Method 1- using sendkeys
       // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/20/2025");

        // Method 2- using date picker
        // Expected data
        String year="2025";
        String month="December";
        String date="19";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        selectMonthAndYear(driver,month,year, date);








    }
}
