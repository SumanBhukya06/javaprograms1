package Day29;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Sliderdemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url="https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        Actions act=new Actions(driver);
        WebElement minslid=driver.findElement(By.xpath("//span[1]"));
        System.out.println(minslid.getLocation());
        act.dragAndDropBy(minslid,100,250).perform();
        System.out.println(minslid.getLocation());


    }
}
