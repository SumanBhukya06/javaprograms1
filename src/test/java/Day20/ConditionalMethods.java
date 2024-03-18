package Day20;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.out;

public class ConditionalMethods{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Url
        String url="https://demo.nopcommerce.com/register?returnUrl=%2F";
        driver.get(url);

        //Male Radio Before selection
        WebElement male= driver.findElement(By.xpath("//input[@id='gender-male']"));
        System.out.println("Before selection"+male.isSelected());//false
        male.click();

        //after selection
        System.out.println("After selection"+male.isSelected());//true

        //female selection
        Boolean female= driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected();
        System.out.println(female);//false

        //img displayed
        boolean im=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        out.println(im);//true

        //Serach box enabled
        boolean se=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
        out.println(se);



        driver.quit();

    }
}
