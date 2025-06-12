package Day18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Locators
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement txt_username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement txt_password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btn_login;


// Action methods
    public void setUsername(String user)
    {
        txt_username.sendKeys(user);
    }

    public void setPassword(String psw)
    {
        txt_password.sendKeys(psw);
    }

    public void clickLogin()
    {
        btn_login.click();
    }

}
