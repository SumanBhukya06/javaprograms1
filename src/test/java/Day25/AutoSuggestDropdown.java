package Day25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //URL
        String url="https://www.google.co.in/";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        //Send single value
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
        Thread.sleep(10);
        List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
        System.out.println("Total suggestions:"+list.size());

        //Select an option from list
        for (int i=0;i< list.size();i++)
        {
           String lis= list.get(i).getText();
            if (lis.equals("selenium download"))
            {
                System.out.println("Test is pass");
            }
            else {
                System.out.println("Test is Fail");
                break;
            }
        }


    }
}
