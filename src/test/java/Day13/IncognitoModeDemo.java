package Day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class IncognitoModeDemo {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://expired.badssl.com/");
        System.out.println("Title of page"+driver.getTitle()); //Privacy Policy

    }
}
