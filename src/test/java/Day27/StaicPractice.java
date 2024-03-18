package Day27;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaicPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //URl
        String url="https://projects.zoho.com/portal/grlprojects#mybugs/19";
        driver.navigate().to(url);
        String title=driver.getTitle();
        System.out.println(title);

        //Login
        WebElement us=driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']"));
        us.sendKeys("bhukya.suman@graniteriverlabs.in");

        //Next button
        WebElement nb=driver.findElement(By.xpath("//button[@id='nextbtn']"));
        nb.click();

        WebElement pw=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
        pw.sendKeys("Suman@4204");


        WebElement sub=driver.findElement(By.xpath("//button[@id='nextbtn']"));
        sub.click();

        int rows=driver.findElements(By.xpath("//table[@data-list='table1709807225277']//tr[2]")).size();
        System.out.println("No of rows:"+rows);


    }
}
