package Day23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplictWaitDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        WebElement forw= driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
        forw.click();
        driver.navigate().back();*/
        driver.navigate().to("https://www.amazon.in/");
        System.out.println(driver.getCurrentUrl());//Amazon

        driver.navigate().to("https://www.myntra.com/");
        System.out.println(driver.getCurrentUrl());//Myntra

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());//Amazon

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());//Myntra

        driver.navigate().refresh();


        //driver.quit();


    }
}
