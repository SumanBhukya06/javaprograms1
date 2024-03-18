package Day20;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args) {
        /*getmethod
        get url
        getTitle
        getText
        getSourcepage

                */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Invoke the browser get url method
        /*String url="https://demo.opencart.com/";
        driver.get(url);
        driver.manage().window().maximize();
        //Search box
        WebElement search=driver.findElement(By.xpath("//input[@name='search']"));
        search.sendKeys("MacBook");

        //get title
        String title=driver.getTitle();
        System.out.println(driver.getTitle());
        if (title.equals("Your Store"))
        {
            System.out.println("Test is passed");
        }
        else
        {
            System.out.println("The test is failed");
        }
        //get page source
        String pg=driver.getPageSource();
        System.out.println(pg);
        System.out.println(pg.contains("html"));*/

        //get window handle
        String url1="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url1);
        //String handle=driver.getWindowHandle();
        //System.out.println("The Window handle is:"+handle);

        WebElement handle1=driver.findElement(By.linkText("OrangeHRM, Inc"));
        handle1.click();










        driver.quit();
    }
}
