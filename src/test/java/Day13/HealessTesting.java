package Day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HealessTesting {
    public static void main(String[] args)
    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless=new");

        WebDriver driver=new ChromeDriver(options);
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
