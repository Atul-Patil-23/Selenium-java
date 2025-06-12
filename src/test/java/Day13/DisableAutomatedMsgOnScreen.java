package Day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DisableAutomatedMsgOnScreen {
    public static void main(String[] args) {
// Remove 'chrome is being controlled by automated test software' msg
        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://expired.badssl.com/");
        System.out.println("Title of page"+driver.getTitle()); //Privacy Policy

    }
}
