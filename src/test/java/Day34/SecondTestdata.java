package Day34;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTestdata {
    WebDriver driver;
    @Test(priority = 1)
    void OpenApp()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        //driver.navigate().to(url);
        //driver.manage().window().maximize();
    }

    @Test(priority = 2)
    void login()
    {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(priority = 3)
    void close()
    {
        driver.quit();
    }
}
