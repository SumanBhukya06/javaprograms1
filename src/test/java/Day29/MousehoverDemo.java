package Day29;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MousehoverDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url="https://demo.opencart.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        Actions act=new Actions(driver);
        act.moveToElement(desktops).moveToElement(mac).click().build().perform();
       // act.moveToElement(desktops).moveToElement(mac).click().perform();


    }
}
