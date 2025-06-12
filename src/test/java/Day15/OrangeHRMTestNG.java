package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMTestNG {
    WebDriver driver;


    @Test(priority = 1)
    void openapp()
    {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @Test(priority = 2)
    void testLogo() throws InterruptedException {
        Thread.sleep(5000);
        Boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println(status);
    }
    @Test(priority = 3)
    void closeApp()
    {
        driver.quit();
    }
}
