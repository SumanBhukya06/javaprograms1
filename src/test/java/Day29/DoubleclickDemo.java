package Day29;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleclickDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        driver.switchTo().frame("iframeResult");//switch to frame

        WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
        f1.clear();
        f1.sendKeys("Welcome To Hyderbad");

        WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        Actions act=new Actions(driver);
        act.doubleClick(button).perform();

        WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
        String copiedtext=f2.getAttribute("value");
        System.out.println("Copied text:"+copiedtext);
        if (copiedtext.equals("Welcome To Hyderbad")){
            System.out.println("Test is passed");
        }
        else
        {
            System.out.println("Test is failed");
        }


    }
}
