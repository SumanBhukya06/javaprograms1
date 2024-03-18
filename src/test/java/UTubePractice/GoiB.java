package UTubePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoiB {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.goibibo.com/flights/?utm_source=bing&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!B!Brand!RSA!150035352!1211662109442708!!e!goibibo!c!&msclkid=e54ffb8a5ea2187844149e65a51e53e3");
        driver.manage().window().maximize();


        JavascriptExecutor js= (JavascriptExecutor) driver;

        //driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();

        driver.findElement(By.xpath("//span[normalize-space()='Hotels']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[@class='sc-dGANrm dBYKkL']")).click();

        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //WebElement flag=driver.findElement(By.xpath("//a[@title='Maldives']//img"));

        js.executeScript("window.scrollBy(0,1000)", "");
        WebElement mal=driver.findElement(By.xpath("//a[normalize-space()='Maldives']"));
        mal.click();

    }
}
