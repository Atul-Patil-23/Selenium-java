package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssignmentDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();

        // Select dropdown country
        WebElement drpCountryElem=driver.findElement(By.xpath("//select[@name='fromPort']"));

        //Select dropdown1 Using select method
        Select drpCountry=new Select(drpCountryElem);
        drpCountry.selectByValue("Boston");


        // Without using Select method- dropdown destination
        WebElement drpDestiElem=driver.findElement(By.xpath("//select[@name='toPort']"));
        Select drpDesti=new Select(drpDestiElem);
       List<WebElement> allOptions= drpDesti.getOptions();
       for(WebElement option:allOptions)
       {
           if(option.getText().equals("Rome"))
           {
               option.click();
           }
       }
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       int priceLen=driver.findElements(By.xpath("//table[@class='table']//td[6]")).size();
       System.out.println(priceLen);
       for (int i=1; i<=priceLen; i++)
       {
           //String priceValue=
           String priceValue = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[6]")).getText();
           //System.out.println(priceValue)
           String[] s = {priceValue};
           System.out.println(Arrays.toString(s));
           Arrays.sort(s);

           System.out.println("After Sorting:"+Arrays.toString(s));

       }

    }
}

