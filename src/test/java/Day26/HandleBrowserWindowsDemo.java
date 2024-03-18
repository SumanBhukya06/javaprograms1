package Day26;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindowsDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //URl
        String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        //click on the child link
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        //get Window Ids
        Set<String> windid=driver.getWindowHandles();
        //System.out.println("Window IDs are:"+windid);

        //Using List collection to get window IDs
        List<String> winlist=new ArrayList<>(windid);
        String parentwindowID=winlist.get(0);
        String childwindowID=winlist.get(1);
        System.out.println(parentwindowID+" "+childwindowID);


        //Switch to child window
        driver.switchTo().window(childwindowID);
        driver.getTitle();
        driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a//button")).click();

        //Switch to parent window
        driver.switchTo().window(parentwindowID);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        /*String a=driver.getTitle();
        System.out.println(a);
        String titleex="OrangeHRM";
        if (a.equals(titleex))
        {
            System.out.println("Test is pass");

        }
        else {
            System.out.println("Test is fail");
        }*/
        for (String wi:windid)
        {
            String ti=driver.switchTo().window(wi).getTitle();
            if (ti.equals("OrangeHRM")){
                driver.close();
            }
        }


    }
}
