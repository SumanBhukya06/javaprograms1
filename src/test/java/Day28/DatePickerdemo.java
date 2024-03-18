package Day28;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerdemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //URl
        String url="https://jqueryui.com/datepicker/";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        //Switch to frame
        driver.switchTo().frame(0);

        //Approach 1
       // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/03/204");//mmddyyyy

        //Approach2
        String month="March";
        String year="2025";
        String day="18";
        //Date table open
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        //select month and year
        while (true){
            String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String ye=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if (mon.equals(month)&&ye.equals(year)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Future date
        }
        //Select date
        List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for (WebElement dt:alldates)
        {
            if (dt.getText().equals(day)){
                dt.click();
                break;
            }
        }


    }
}
