package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws MalformedURLException {
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
            Set<String> windowID=driver.getWindowHandles();

            // Approach 1
            List<String> windowlist=new ArrayList(windowID); // set collection don't have get method to access individual element.
            // So thats why we converted into list.
            String parentID=windowlist.get(0);
            String childID=windowlist.get(1);

            System.out.println(driver.getTitle());  // driver is focusing on parent page.

            //switch to child window
            driver.switchTo().window(childID);
            System.out.println(driver.getTitle());

           //switch to parent  window
            driver.switchTo().window(parentID);

            //Approach 2 using for each loop
            for(String winID:windowID)
            {
                String title= driver.switchTo().window(winID).getTitle();
                if(title.equals("OrangeHRM"))
                {
                    System.out.println(driver.getCurrentUrl());
                }
            }

        }
    }
}
