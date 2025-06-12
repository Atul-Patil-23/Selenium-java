package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php/");
        driver.manage().window().maximize();
// single file upload
       // driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:\\Users\\Admin\\Desktop\\smart-tag-testing.txt");

// multiple file upload
        String file1="C:\\Users\\Admin\\Desktop\\smart-tag-testing.txt";
        String file2="C:\\Users\\Admin\\Desktop\\NHB new users.txt";
        driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys(file1+"\n"+file2);
        int noOfFiles=driver.findElements(By.xpath("//ul[@id='fileList']")).size();

    }
}
