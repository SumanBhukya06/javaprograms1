package Day25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleJSalert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
        //URl
        String url="https://the-internet.herokuapp.com/javascript_alerts";
        driver.navigate().to(url);

        //Idetify Element to click
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        //Alert alertwindow=driver.switchTo().alert();
        Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alertwindow.getText());
        alertwindow.accept(); //You successfully clicked an alert





    }
}
