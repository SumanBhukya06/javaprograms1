package Day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WPagefactoryLoginPage {

    public WebDriver driver;
    //constructor
    WPagefactoryLoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Locators+Identification
    //using FindBy type instead of By type
    @FindBy(xpath="//img[@alt='company-branding']")
    WebElement img_logo;
    @FindBy(xpath="//input[@name='username']")
    WebElement txt_un;
    @FindBy(xpath="//input[@name='password']")
    WebElement txt_pwd;
    @FindBy(xpath="//button[@type='submit']")
    WebElement but_sub;

    //Action methods
    public void setUserName(String username)
    {
        txt_un.sendKeys(username);
    }
    public void setPassword(String password)
    {
        txt_pwd.sendKeys(password);
    }

    public void clickSubmit()
    {
        but_sub.click();
    }

    public boolean checklogopresence()
    {
        boolean status=img_logo.isDisplayed();
        return status;
    }
}
