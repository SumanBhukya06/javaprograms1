package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDEmo1 {
    public static void main(String[] args) throws InterruptedException {
        //Launch browser
        WebDriver driver= new ChromeDriver();
        String url="http://www.automationpractice.pl/index.php?";
        driver.get(url);
        Thread.sleep(2000);

        //Maximize window
        driver.manage().window().maximize();
        //locate the search box uisng ID attribute
        //WebElement search_b=driver.findElement(By.id("search_query_top"));
        //search_b.sendKeys("T-shirts");

        //locate submit button
        //WebElement sub_but=driver.findElement(By.name("submit_search"));
        //sub_but.click();

        //Find the total no of slides
        List<WebElement>sliders=driver.findElements(By.className("homeslider-container"));
        System.out.println("The no of sliders are:"+sliders.size());

        //Find the total no of images
        List<WebElement> images= driver.findElements(By.tagName("img"));
        System.out.println("The no of images are:"+images.size());

        //Find total no of links
        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println("The no of links are:"+links.size());
        String actual_title= driver.getTitle();
        String exp_title="My Shop";
        if (actual_title.equals(exp_title))
        {
            System.out.println("Test is passed");
        }
        else {
            System.out.println("Test is failed.");
        }

        //quite browser
        driver.quit();

    }
}
