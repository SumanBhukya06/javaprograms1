package Day26;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class HandaleframesDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //URL
        String url="https://testautomationpractice.blogspot.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        //Clicking on the search box and sending keys
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Testing");
        driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();

        //Searching for links
        List<WebElement>searchlist=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div//a"));
        System.out.println("Number of searching links:"+searchlist.size());//5

        System.out.println("Printing and clicking on the links.");
        for (WebElement links:searchlist)
        {
            System.out.println(links.getText());
            links.click();
        }
        //after opening all windows get windows ids and title
        Set <String> windowids=driver.getWindowHandles();
        for (String winid:windowids)
        {
            String title=driver.switchTo().window(winid).getTitle();
            System.out.println(title);
        }
        String act_t="Testing and inspection of diving cylinders";
        String exp_t="Testing and inspection of diving cylinders";
        String exp_t1="Testing effect - Wikipedia";
        if (act_t.equals(exp_t))
        {
            driver.close();
        }
        }
        //driver.quit();
    }
