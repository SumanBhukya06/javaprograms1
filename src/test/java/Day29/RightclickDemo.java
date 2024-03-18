package Day29;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightclickDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url="https://swisnl.github.io/jQuery-contextMenu/demo.html";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        WebElement rc=driver.findElement(By.xpath("//span[normalize-space()='right click me']"));

        Actions act=new Actions(driver);
        act.contextClick(rc).perform();

        WebElement copy=driver.findElement(By.xpath("//span[normalize-space()='Copy']"));
        act.contextClick(copy).perform();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

       /* WebElement edit=driver.findElement(By.xpath("//span[normalize-space()='Edit']"));
        act.contextClick(edit).perform();
        driver.switchTo().alert().accept();*/


    }
}
