package Day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
// If we do not use xml file then below is the option for listeners. But this is not good way.
@Listeners(Day20.Listeners.class)
public class OrangeHRM {

    WebDriver driver;
    @BeforeClass
    void setup() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
void testLogo()
{
    boolean status= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
    Assert.assertEquals(status,true);

}

@Test(priority = 2)
void testAppUrl()
{
    Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demooooooo");
}

@Test(priority = 3, dependsOnMethods = {"testAppUrl"})
void testHomePageTitle()
{
Assert.assertEquals(driver.getTitle(),"OrangeHRM");
}

@AfterClass
    void tearDown()
{
    driver.quit();
}










}
