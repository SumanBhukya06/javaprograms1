package Day25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleJSpromptbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //Explicit Wait
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));

        //URl
        String url="https://the-internet.herokuapp.com/javascript_alerts";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        //Clicking on the prompt
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        //Alert alertwindow=driver.switchTo().alert();
        Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alertwindow.getText());
        alertwindow.sendKeys("suman");
        alertwindow.accept();
        String Text=driver.findElement(By.xpath("//p[@id='result']")).getText();
        String exp="You entered: Suman";
        if (Text.equals(exp))
        {
            System.out.println("Successful");
        }
        else {
            System.out.println("Unsuccessful");
        }

    }
}
