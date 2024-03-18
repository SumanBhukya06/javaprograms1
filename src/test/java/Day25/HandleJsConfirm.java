package Day25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleJsConfirm {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));

        //URL
        String url="https://the-internet.herokuapp.com/javascript_alerts";
        driver.navigate().to(url);

        //clicking the element
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alertwindow.getText());
        //alertwindow.accept();
        alertwindow.dismiss();

    }
}
