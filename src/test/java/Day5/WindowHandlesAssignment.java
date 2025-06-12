package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WindowHandlesAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
       // System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement link:links)
        {
            System.out.println(link.getText());
          System.out.println(link.getDomAttribute("href"));
        }






    }

    }

