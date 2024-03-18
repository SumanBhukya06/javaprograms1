package UTubePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OpenCartsample1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://localhost/opencart/upload/index.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        WebElement element=driver.findElement(By.xpath("(//input[@id='input-newsletter'])[1]"));

        WebElement element2=driver.findElement(By.xpath("(//input[@name='agree'])"));

        WebElement btn=driver.findElement(By.xpath("//button[normalize-space()='Continue']"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);
        js.executeScript("arguments[0].click();",element2);
        js.executeScript("arguments[0].click()",btn);


    }
}
