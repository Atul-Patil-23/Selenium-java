package Day19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class DesiredCapabilitiesDemo {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("111.0");
        capabilities.setCapability("platform", "WINDOWS");
        capabilities.setCapability("acceptInsecureCerts", true);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

        driver.get("https://www.example.com");
        System.out.println(driver.getTitle());

        driver.quit();


    }

}
