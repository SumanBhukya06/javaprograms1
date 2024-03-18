package Day19;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CssSelectorsDemo {
    public static void main(String[] args) throws InterruptedException {
        //Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //String url="https://demo.nopcommerce.com/";
        String url = "http://localhost:3003/v12214.html";
        driver.get(url);
        Thread.sleep(2000);
        /*driver.manage().window().maximize();

        // locate web element
        //WebElement searchb=driver.findElement(By.cssSelector("input#small-searchterms"));
        //searchb.sendKeys("MacBook");

        //Submit button
       // WebElement sub= driver.findElement(By.cssSelector("button.button-1"));
       // sub.click();
       // List<WebElement> slide=driver.findElements(By.xpath("//div[@class='nivo-slider']"));
        //System.out.println(slide.size());
        //List <WebElement> im=driver.findElements(By.xpath("//img[@class='nivo-main-image']"));
        //System.out.println(im.size());

        String ti=driver.getTitle();
        System.out.println(ti);
         WebElement gt=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
         gt.getText();

        //click on the register
        WebElement reg=driver.findElement(By.xpath("//a[@class='ico-register']"));
        reg.click();

        WebElement fs=driver.findElement(By.xpath("//input[@name='FirstName']"));
        fs.sendKeys("Valli");

        WebElement ls= driver.findElement(By.xpath("//input[@name='LastName']"));
        ls.sendKeys("Pushpa");


       driver.close();*/
    }

}
