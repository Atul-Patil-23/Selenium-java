package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class NavigationalCommands {
    public static void main(String[] args) throws MalformedURLException {
        {
            WebDriver driver = new ChromeDriver();
            // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            URL url = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.navigate().to(url);

        }
    }
}
