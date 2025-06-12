package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ScrollingPage {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // here downcasting performed
        JavascriptExecutor js=(JavascriptExecutor)driver;

        //scrolling down page by pixel number
        js.executeScript("window.scrollBy(0,1500)");
        System.out.println(js.executeScript("return window.pageYOffset;"));



       /* //scroll the page till element is visible
        WebElement ele=driver.findElement(By.xpath("//h2[contains(text(),'Pagination Web Table')]"));
        js.executeScript("arguments[0].scrollIntoView();",ele);
        System.out.println(js.executeScript("return window.pageYOffset;"));

        */

        /*//scroll till end of page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        // scrolling to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");


         */
    }
}
