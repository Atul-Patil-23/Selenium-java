package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificBrowserWindow {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
        Set<String> windowID=driver.getWindowHandles();
        for(String winID:windowID) {
            String title = driver.switchTo().window(winID).getTitle();
            System.out.println(title);
            if(title.equals("OrangeHRM") || title.equals("some other browser window"))
            {
                driver.close();
            }
        }



    }


}
