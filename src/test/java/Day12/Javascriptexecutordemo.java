package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Javascriptexecutordemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement inputBox=driver.findElement(By.xpath("//input[@id='name']"));

        //passing text into input box using javascriptexecutor - alternate of sendkeys() method.
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','John')",inputBox);

        //click on element - alternate of click method
        WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()",radiobtn);
        //js.executeScript("arguments[0].click()",radiobtn);

    }


}
