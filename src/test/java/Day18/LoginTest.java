package Day18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class LoginTest {

    WebDriver driver;
@BeforeClass
    void setup()
    {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
void testlogin()
{
    LoginPage lp=new LoginPage(driver);
    lp.setUsername("Admin");
    lp.setPassword("admin123");
    lp.clickLogin();

    Assert.assertEquals(driver.getTitle(),"OrangeHRM");
}

@AfterClass
    void tearDown()
{
    driver.quit();
}

}
