package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://support.orangehrm.com/portal/en/signin");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        boolean bl=driver.findElement(By.xpath("//div[@title='OrangeHRM']")).isDisplayed();
        System.out.println(bl);
       // driver.quit();

        // find number of links
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("number of links:"+links.size());

    }
}
