package Day24;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HandledropDownWithSelectTag {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url="https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/";
        driver.navigate().to(url);
        driver.manage().window().maximize();


        //By visibleText option selecting 1st method
        WebElement country=driver.findElement(By.xpath("//select[@id='country-list'][@name='country']"));
        Select drp1=new Select(country);
        //drp1.selectByVisibleText("Brazil");
        drp1.selectByValue("3");//Use when there is a value attribute

        //Find total options
        List<WebElement> options=drp1.getOptions();
        System.out.println("The total options are:"+options.size());//6

        //Print total options
       /* for (int i=1;i< options.size();i++)
        {
            System.out.println(options.get(i).getText());
        }*/
        for (WebElement op:options)
        {
            System.out.println(op.getText());
        }
        //driver.quit();





    }
}
