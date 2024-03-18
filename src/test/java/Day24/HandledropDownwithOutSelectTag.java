package Day24;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandledropDownwithOutSelectTag {
    public static void main(String[] args) {
        //Webdriver setup
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //Implict time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Url
        String url="https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        //clicking on the dropdown
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
        List<WebElement>option=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));

        //Find total number options
        System.out.println("Total options:"+option.size());

        //print all options
        /*for (int i=0;i< option.size();i++)
        {
            System.out.println(option.get(i).getText());
        }*/
       /* for (WebElement opt:option)
        {
            System.out.println(opt.getText());
        }*/

        //Select option from dropdown
        /*for (int i=0;i< option.size();i++)
        {
            String op=option.get(i).getText();
            if (op.equals("Java")||op.equals("Python"));
            {
                option.get(i).click();
            }*/
        for (WebElement opt:option)
        {
            String text=opt.getText();
            if (text.equals("Java") || text.equals("Python")){
                opt.click();
            }

        }

    }
}
