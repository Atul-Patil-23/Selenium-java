package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second_class {
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://support.orangehrm.com/portal/en/signin");
         String title=driver.getTitle();
        if(title.equals("OrangeHRM | Sign In"))
        {
            System.out.println("Testing pass");
        }
        else
        
        {
            System.out.println("Testing failed");
        }
        driver.quit();

    }
}
