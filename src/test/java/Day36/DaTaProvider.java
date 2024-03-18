package Day36;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DaTaProvider {
    WebDriver driver;
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    void testLogin()
    {
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Flogin");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("prince@gmail.com");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("abc123");
        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();

        driver.switchTo().alert().accept();
    }
}
