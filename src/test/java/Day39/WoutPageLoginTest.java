package Day39;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class WoutPageLoginTest {
    WebDriver driver;
    //WOutPagefactoryLoginPage lp;
    WPagefactoryLoginPage lp;
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test(priority = 1)
    void testLogo()
    {
        //lp=new WOutPagefactoryLoginPage(driver);
        lp=new WPagefactoryLoginPage(driver);
        Assert.assertEquals(lp.checklogopresence(),false);
    }
    @Test(priority = 2)
    void testLogin()
    {
        lp.setUserName("Admin");
        lp.setPassword("admin123");
        lp.clickSubmit();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }

}
