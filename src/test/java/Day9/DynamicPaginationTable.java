package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DynamicPaginationTable {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

        driver.get("https://demo.opencart.com/admin/index.php");
        Thread.sleep(10000);
        driver.manage().window().maximize();
        // Enter username
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        username.click();
        username.sendKeys("demo");

        // Enter password
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.click();
        password.sendKeys("demo");

        // click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();









    }
}
