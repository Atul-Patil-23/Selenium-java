package Day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HandleSSL {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.setAcceptInsecureCerts(true);


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://expired.badssl.com/");
        System.out.println("Title of page"+driver.getTitle()); //Privacy Policy

    }
}
