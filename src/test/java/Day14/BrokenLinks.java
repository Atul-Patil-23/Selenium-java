package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

/*
Steps
1) Link href"https://xvy.com"
2) https://xvy.com  > server  > status code
3) status>=400 broken link
status<400  not broken link
 */





public class BrokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        int noOfBrokenLinks=0;

    // find the total links
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total number of links:"+links.size());

        for(WebElement linkElement:links) {
            String hrefAttValue = linkElement.getDomAttribute("href");
            if (hrefAttValue == null || hrefAttValue.isEmpty()) {
                System.out.println("href attribute value is null o empty. SO not possible");
                continue;
            }

            try{
            // hit URL to server
            URL linkURL = new URL(hrefAttValue); // convert href value from string to url format
            HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();// open connection to the server
            connection.connect(); // connect to the server and send request to the server

            if (connection.getResponseCode() >= 400) {
                System.out.println(hrefAttValue+ " ===>Broken link");
                noOfBrokenLinks++;
            } else {
                System.out.println(hrefAttValue+" ==>Not broken link");
            }
        }
            catch (Exception e)
            {

            }
            }
        System.out.println("no of broken links:"+noOfBrokenLinks);

        }

    }

