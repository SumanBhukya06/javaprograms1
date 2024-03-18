package Day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WOutPagefactoryLoginPage {

    public WebDriver driver;
    //constructor
    WOutPagefactoryLoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //Locators
    //using By type
    By img_logo=By.xpath("//img[@alt='company-branding']");
    By txt_un=By.xpath("//input[@name='username']");
    By txt_pwd=By.xpath("//input[@name='password']");
    By but_sub=By.xpath("//button[@type='submit']");

    //Action methods
    public void setUserName(String username)
    {
        driver.findElement(txt_un).sendKeys(username);
    }
    public void setPassword(String password)
    {
        driver.findElement(txt_pwd).sendKeys(password);
    }

    public void clicksubmit()
    {
        driver.findElement(but_sub);
    }

    public boolean checklogopresence()
    {
        boolean status=driver.findElement(img_logo).isDisplayed();
        return status;
    }
}
