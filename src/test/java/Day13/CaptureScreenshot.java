package Day13;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class CaptureScreenshot {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // Full page ss. Here down casting
       /* TakesScreenshot ts=(TakesScreenshot) driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);
        File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
        sourceFile.renameTo(targetFile);  // copy source file to target file

        */
        // capture the ss of specific section
        WebElement featureProduct=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourceFile=featureProduct.getScreenshotAs(OutputType.FILE);
        File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\featureProduct.png");
        sourceFile.renameTo(targetFile);


    }
}
