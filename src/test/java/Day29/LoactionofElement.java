package Day29;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoactionofElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
        driver.navigate().to(url);

        WebElement logo=driver.findElement(By.xpath("//div[@id='header']"));
        System.out.println("Before maximizing window"+logo.getLocation());//0,0
        Thread.sleep(3000);

        driver.manage().window().maximize();
        System.out.println("Maximizing window:"+logo.getLocation());
        Thread.sleep(3000);

        driver.manage().window().minimize();
        System.out.println("Minimising window:"+logo.getLocation());
        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("Full screen:"+logo.getLocation());

        Point p=new Point(100,100);
        driver.manage().window().setPosition(p);
        System.out.println("Position 100,100 window"+logo.getLocation());

        p=new Point(50,50);
        driver.manage().window().setPosition(p);
        System.out.println("Posotion of 50:50:"+logo.getLocation());



    }
}
